package aqajava.hw9.animals;

public class CatsAndFoodMain {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Bourgeois", 150), new Cat("Stripe", 150), new Cat("Spot", 140), new Cat( "Milo", 80)};
        Plate bowl = new Plate(400);

        for(Cat cat: cats) {
            cat.eat(bowl);
        }

        bowl.info();
        bowl.addFood(400);
        bowl.addFood(300);

        for(Cat cat: cats) {
            if(!cat.getCatFullness()) {
                cat.eat(bowl);
                cat.infoCatFullness();
            }
        }

        for(Cat cat: cats) {
            cat.infoCatFullness();
        }
    }
}
