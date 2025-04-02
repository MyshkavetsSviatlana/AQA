package aqajava.hw10.fruitbox;

public class Apple extends Fruit {
    static float weight = 0.1f;
    String fruitName = "apple";

    @Override
    public String getFruitName() {
        return fruitName;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
