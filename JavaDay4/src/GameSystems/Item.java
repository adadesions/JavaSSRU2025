package GameSystems;

public class Item {
    private String name;
    private String type;
    private String rarity;
    private int power;

    public Item(String name, String type, String rarity, int power) {

        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getRarity() {
        return rarity;
    }
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rarity='" + rarity + '\'' +
                ", power=" + power +
                '}';
    }

}
