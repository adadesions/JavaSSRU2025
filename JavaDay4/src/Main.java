import DynamicProgramming.GridTravelerProblem;
import GameSystems.InventorySystem;
import GameSystems.Item;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();
        inventory.addItem(new Item("Iron Sword", "Weapon", "Common", 10));
        inventory.addItem(new Item("Steel Sword", "Weapon", "Rare", 25));
        inventory.addItem(new Item("Health Potion", "Potion", "Common", 5));
        inventory.addItem(new Item("Epic Sword", "Weapon", "Epic", 40));
        inventory.addItem(new Item("Mega Shield", "Armor", "Rare", 15));
        inventory.addItem(new Item("Dragon Armor", "Armor", "Epic", 50));
        inventory.addItem(new Item("Mana Potion", "Potion", "Rare", 20));
        inventory.addItem(new Item("Mystic Wand", "Weapon", "Rare", 30));
        inventory.addItem(new Item("Basic Shield", "Armor", "Common", 8));
        inventory.addItem(new Item("Elixir of Life", "Potion", "Epic", 100));
        inventory.addItem(new Item("Bow of Destiny", "Weapon", "Rare", 35));
        inventory.addItem(new Item("Leather Armor", "Armor", "Common", 12));

        List<Item> result = inventory.search("Weapon", "Rare", 20, true);
        System.out.println("Filtered Items:");
        for (Item item : result) {
            System.out.println(item);
        }

        List<Item> onlyWeapons = inventory.search("Weapon", "", 0, false);
        System.out.println("\nFiltered Items by Type (Weapon):");
        for (Item item : onlyWeapons) {
            System.out.println(item);
        }
        
        // Get Item from InventorySystem
        Item targetItem = inventory.getItem("Epic Sword");
        System.out.println("Get Item by Name: " + targetItem);
    }
}