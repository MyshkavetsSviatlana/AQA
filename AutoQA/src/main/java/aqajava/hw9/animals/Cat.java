package aqajava.hw9.animals;

public class Cat extends Animal {
    private final String name;
    private final int appetite;
    boolean fullness;
    private static final int MAX_RUNNING_DISTANCE = 200;
    static int catCounter = 0;

    public Cat(String name, int appetite) {
        super(name);
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
        catCounter += 1;
    }

    public void getCatCounter() {
        System.out.println("Total number of cats: " + catCounter);
    }

    public void infoCatFullness() {
        System.out.println("Cat " + this.name + " is full: " + fullness);
    }

    public boolean getCatFullness() {
        return this.fullness;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run(int distance) {
        if (distance > MAX_RUNNING_DISTANCE) {
            System.out.println("Cats cannot run further than " + MAX_RUNNING_DISTANCE + " meters.");
        } else if (distance <= 0) {
            System.out.println("Distance for " + this.name + " to run should be greater than 0.");
        } else {
            System.out.println(this.name + " ran " + distance + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim.");
    }

    public void eat(Plate plate) {
        if (plate.getFullness() > this.appetite) {
            plate.decreaseFood(appetite);
            System.out.println(this.name + " is eating.");
            this.fullness = true;
        } else {
            System.out.println(this.name + " is hungry. Feed it.");
        }

    }
}