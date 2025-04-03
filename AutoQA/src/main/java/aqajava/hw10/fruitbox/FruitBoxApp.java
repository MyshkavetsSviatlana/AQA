package aqajava.hw10.fruitbox;

public class FruitBoxApp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        // create a box of 10 apples
        Box<Apple> appleBox = new Box<>();
        for (int i = 0; i < 10; i++) {
            appleBox.addElement(apple);
        }

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addElement(apple);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addElement(orange);
        orangeBox.addElement(orange);

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addElement(orange);
        orangeBox2.addElement(orange);
        orangeBox2.addElement(orange);

        // get weight of the box
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox2.getWeight());

        //print contents
        appleBox.printBoxContent();
        orangeBox.printBoxContent();

        // compare false
        System.out.println(appleBox.compare(appleBox2));
        //compare true
        System.out.println(appleBox.compare(orangeBox));

        // transfer successfully
        appleBox2.printBoxContent();
        appleBox2.transfer(appleBox);
        appleBox.printBoxContent();
        appleBox2.printBoxContent();

        // transfer unsuccessfully
        appleBox2.transfer(appleBox);
        orangeBox.transfer(orangeBox2);
    }
}
