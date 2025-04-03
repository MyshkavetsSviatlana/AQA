package aqajava.hw9.animals;

abstract class Animal {
    static int animalCount = 0;
    String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
