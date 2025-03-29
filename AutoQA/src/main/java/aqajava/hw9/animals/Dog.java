package aqajava.hw9.animals;

public class Dog extends Animal {
    private final String name;
    final int runningDistance = 500;
    final int swimmingDistance = 10;
    static int dogCounter = 0;

    public Dog(String name) {
        this.name = name;
        dogCounter +=1;
    }

    public void getDogCounter() {
        System.out.println("Total number of dogs: "+ dogCounter);
    }

    @Override
    public void run(int distance) {
        if(distance > runningDistance) {
            System.out.println("Dogs cannot run further than " + runningDistance + " meters.");
        } else if(distance <=0) {
            System.out.println("Distance for " + this.name + " to run should be greater than 0.");
        } else {
            System.out.print(this.name);
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if(distance > swimmingDistance) {
            System.out.println("Dogs cannot swim further than " + swimmingDistance + " meters.");
        } else if(distance <= 0) {
            System.out.println("Distance for " + this.name + " to swim should be greater than 0.");
        } else {
            System.out.print(this.name);
            super.swim(distance);
        }
    }
}

