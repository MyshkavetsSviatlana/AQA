package aqajava.hw9.animals;

public class Plate {
    private int food;
    private final int fullPlate;

    public Plate(int food) {
        this.food = food;
        this.fullPlate = food;
    }

    public void info() {
        System.out.println("Current amount of food on the plate: " + food);
    }

    public int getFullness() {
        return this.food;
    }

    public void decreaseFood(int n) {
        if (this.food < n) {
            System.out.println("There is not enough food on the plate.");
        } else {
            this.food -= n;
        }
    }

    public void addFood(int n) {
        int placeLeft = this.fullPlate - this.food;
        System.out.println("Adding " + n + " of food.");
        if (placeLeft >= n) {
            this.food += n;
            System.out.println("Amount of food added: " + n);
        } else {
            System.out.println("There is no place enough in this plate. You can add " + placeLeft + " only.");
        }
    }
}