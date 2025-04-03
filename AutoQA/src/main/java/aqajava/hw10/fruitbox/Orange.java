package aqajava.hw10.fruitbox;

public class Orange extends Fruit {
    static float weight = 0.5f;
    String fruitName = "orange";

    @Override
    public String getFruitName() {
        return fruitName;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}

