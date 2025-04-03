package aqajava.hw10.fruitbox;

/*
1. Fruit, Apple extends Fruit, Orange extends Fruit;
2. Create a class Box, where fruits can be stored. The boxes are conditionally sorted by fruit type,
so you cannot store both apples and oranges in the same box;
3. For storing fruits inside the box, you can use an ArrayList;
4. Write a getWeight() method that calculates the weight of the box, knowing the weight of one fruit and
their quantity: the weight of an apple is 1.0f, and the weight of an orange is 1.5f (units of measurement
are not important);
5. Inside the Box class, implement the compare() method that allows comparing the current box
with another one passed as a parameter to compare(). It should return true if the weights are equal,
and false otherwise. You can compare boxes with apples and oranges;
6. Write a method that allows transferring fruits from the current box to another.
Remember the fruit sorting: you cannot pour apples into a box with oranges. Therefore, the current box
should be empty after the transfer, and the other box should receive the objects that were in the first box;
7. Don't forget about the method to add a fruit to the box.
 */

abstract class Fruit {
    float weight;
    String fruitName;

    public float getWeight() {
        return weight;
    }

    public String getFruitName() {
        return fruitName;
    }
}
