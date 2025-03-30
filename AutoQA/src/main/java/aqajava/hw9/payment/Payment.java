package aqajava.hw9.payment;

/*
Create a Payment class with an inner class, through which objects can form a purchase of multiple items.
 */

import java.util.ArrayList;

public class Payment {
    ArrayList<Item> items = new ArrayList<>();

    public Payment() {
    }

    public Payment(String name, double itemPrice, int quantity) {
        Item item = new Item(name, itemPrice);
        item.quantity = quantity;
        items.add(item);
    }

    public void addItems(String name, double itemPrice, int quantity) {
        Item item = new Item(name, itemPrice);
        item.quantity = quantity;
        items.add(item);
    }

    public void addItems(Item item, int quantity) {
        item.quantity = quantity;
        items.add(item);
    }

    public void removeItems(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    public void removeItems(Item itemToRemove) {
        items.removeIf(item -> item == itemToRemove);
    }

    public void costDetails() {
        int counter = 0;
        double totalCost = 0;
        for(Item item : items) {
            counter += 1;
            totalCost += item.getItemPrice()*item.getQuantity();
            System.out.println(item.getName() + "   " + item.getItemPrice() + " * " + item.getQuantity() + " pcs" + " = " + item.getItemPrice()*item.getQuantity());
        }
        System.out.println("------------------------------");
        System.out.println("# of positions " + counter + ", total cost "+ totalCost);
    }

    public class Item {
        final String name;
        double itemPrice;
        int quantity = 0;

        public Item(String name, double itemPrice) {
            this.itemPrice = itemPrice;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
