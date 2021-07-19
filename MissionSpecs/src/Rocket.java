

import java.util.ArrayList;

public abstract class Rocket implements SpaceShip {
    private ArrayList<Item> items;
    private double shipWeight;
    private double shipLimit;
    private int count = 0;//for object;
    private static int rocketCount;
    private int cost;

    public Rocket(double shipWeight, double shipLimit, int cost) {
        this.shipWeight = shipWeight * 1000;
        this.shipLimit = shipLimit * 1000;
        this.cost = cost;
        rocketCount++;//total
        count++;//object
        items = new ArrayList<Item>();
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return shipLimit - shipWeight >= item.getWeight() + cargoWight();
    }

    ;

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getShipWeight() {
        return shipWeight;
    }

    public void setShipWeight(double shipWeight) {
        this.shipWeight = shipWeight;
    }

    public double getShipLimit() {
        return shipLimit;
    }

    public void setShipLimit(double shipLimit) {
        this.shipLimit = shipLimit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getRocketCount() {
        return rocketCount;
    }

    public static void setRocketCount(int rocketCount) {
        Rocket.rocketCount = rocketCount;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void carry(Item item) {
        if (canCarry(item)) {
            items.add(item);
        } else {
            System.out.println("it is false add item");
        }

    }

    public void countAdd() {
        count++;
        rocketCount++;
    }

    public double cargoWight() {
        double cargoWight = 0;

        for (Item cargoItem : items) {
            cargoWight = cargoWight + cargoItem.getWeight();
        }
        return cargoWight;
    }


}