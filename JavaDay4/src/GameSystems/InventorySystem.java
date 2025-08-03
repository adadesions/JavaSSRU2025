package GameSystems;

import java.util.*;

public class InventorySystem {
    private final List<Item> inventory;
    private final Map<String, Item> inventoryMap;

    public InventorySystem() {
        this.inventory = new ArrayList<>();
        this.inventoryMap = new HashMap<>();
    }

    public void addItem(Item item) {
        inventory.add(item);
        inventoryMap.put(item.getName(), item);
    }

    public List<Item> search(String type, String rarity, int minPower, boolean isAsc) {

        Queue<Item> queueResult = filter(type, rarity, minPower, isAsc);

        // Convert the Queue to a List for sorting
        List<Item> result = new ArrayList<>();
        while (!queueResult.isEmpty()) {
            result.add(queueResult.poll());
        }

        return result;
    }

    public Queue<Item> filter(String type, String rarity, int minPower, boolean isAsc) {
        Queue<Item> result = new PriorityQueue<Item>(
                isAsc ? Comparator.comparingInt(Item::getPower) : Comparator.comparingInt(Item::getPower).reversed()
        );

        // Condition 1: If all parameters are not empty, return the by filtered items
        if (!type.isEmpty() && !rarity.isEmpty() && minPower > 0) {
            filterWithFullConditions(type, rarity, minPower, result);
            return result;
        }

        // Condition 2: If only type is not empty, return the items by type
        if (!type.isEmpty() && rarity.isEmpty() && minPower <= 0){
            filterWithTypeSearch(type, result);
            return result;
        }

        return null;
    }

    private void filterWithTypeSearch(String type, Queue<Item> result) {
        for (Item item : inventory) {
            if (item.getType().equals(type)) {
                result.add(item);
            }
        }
    }

    private void filterWithFullConditions(String type, String rarity, int minPower, Queue<Item> result) {
        for (Item item : inventory) {
            boolean isPassedFilter = item.getType().equals(type) &&
                    item.getRarity().equals(rarity) &&
                    item.getPower() >= minPower;

            if (isPassedFilter) {
                result.add(item);
            }
        }
    }

    public Item getItem(String name) {
        return inventoryMap.get(name);
    }
}
