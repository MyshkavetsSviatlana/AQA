package aqajava.hw10.fruitbox;

import java.util.ArrayList;

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
        // uncomment 7 lines below to see the contents of the box
        //String[] boxToPrint = new String[box.size()];
        //int i = 0;
        //for(T fruit : box) {
            //boxToPrint[i] = fruit.getFruitName();
            //i++;
        //}
        //System.out.println(Arrays.toString(boxToPrint));
        System.out.println("Quantity of " + fruit.getFruitName() + "(s) in this box is " + box.size() + ".");
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
    public void transfer(Box<T> boxToTransferTo) {
        if(this.box.isEmpty()){
            System.out.println("No fruits to transfer.");
        } else if(this.getFruit().getFruitName().equals(boxToTransferTo.getFruit().getFruitName())) {
            boxToTransferTo.box.addAll(this.box);
            box.clear();
        }
    }
}