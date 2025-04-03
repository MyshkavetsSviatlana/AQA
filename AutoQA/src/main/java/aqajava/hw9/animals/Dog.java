package aqajava.hw9.animals;

public class Dog extends Animal {
    private final String name;
    private static final int MAX_RUNNING_DISTANCE = 500;
    private static final int MAX_SWIMMING_DISTANCE = 10;
    static int dogCounter = 0;

    public Dog(String name) {
        super(name);
        this.name = name;
        dogCounter += 1;
    }

    public void getDogCounter() {
        System.out.println("Total number of dogs: " + dogCounter);
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_RUNNING_DISTANCE) {
            System.out.println("Dogs cannot run further than " + MAX_RUNNING_DISTANCE + " meters.");
        } else if (distance <= 0) {
            System.out.println("Distance for " + this.name + " to run should be greater than 0.");
        } else {
            System.out.println(this.name + " ran " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > MAX_SWIMMING_DISTANCE) {
            System.out.println("Dogs cannot swim further than " + MAX_SWIMMING_DISTANCE + " meters.");
        } else if (distance <= 0) {
            System.out.println("Distance for " + this.name + " to swim should be greater than 0.");
        } else {
            System.out.println(this.name + " swam " + distance + " meters.");
        }
    }
}

