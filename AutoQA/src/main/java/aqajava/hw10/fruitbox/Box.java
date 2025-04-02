package aqajava.hw10.fruitbox;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{
    private T fruit;
    private final ArrayList<T> box = new ArrayList<>();

    public T getFruit() {
        return fruit;
    }

    // add fruit to the box
    public void addElement(T fruit) {
        this.fruit = fruit;
        box.add(fruit);
    }

    // print box contents
    public void printBoxContent() {
        String[] boxToPrint = new String[box.size()];
        int i = 0;
        for(T fruit : box) {
            boxToPrint[i] = fruit.getFruitName();
            i++;
        }
        System.out.println(Arrays.toString(boxToPrint));
    }

    // get weight of the box
    public float getWeight() {
        return getFruit().getWeight() * box.size();
    }

    // compare boxes
    public boolean compare(Box<?> boxToCompare) {
        return this.getWeight() == boxToCompare.getWeight();
    }

     // transfer fruits from box to box
    public void transfer(Box boxToTransferTo) {
        if(this.getFruit().getFruitName().equals(boxToTransferTo.getFruit().getFruitName())) {
            boxToTransferTo.box.addAll(this.box);
            box.clear();
        } else {
            System.out.println("You cannot transfer " + this.fruit.getFruitName() + "s to the box of " + boxToTransferTo.fruit.getFruitName() + "s.");
        }
    }
}