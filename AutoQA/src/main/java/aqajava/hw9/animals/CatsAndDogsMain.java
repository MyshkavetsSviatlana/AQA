package aqajava.hw9.animals;

public class CatsAndDogsMain {
    public static void main(String[] args) {
        Cat catMilka = new Cat("Milka", 80);
        catMilka.getCatCounter();
        Cat catPersik = new Cat("Persik", 100);
        catPersik.getCatCounter();
        Cat catMashka = new Cat("Mashka", 90);
        catMilka.getCatCounter();
        catPersik.run(100);
        catMashka.run(250);
        catPersik.swim(200);
        catMashka.run(180);
        catMilka.run(0);

        Dog dogHilda = new Dog("Hilda");
        dogHilda.getDogCounter();
        Dog dogSnoopy = new Dog("Snoopy");
        dogSnoopy.getDogCounter();
        Dog dogSonya = new Dog("Sonya");
        dogSonya.getDogCounter();
        Dog dogRex = new Dog("Rex");
        dogHilda.getDogCounter();
        dogHilda.run(600);
        dogSnoopy.swim(20);
        dogSonya.run(400);
        dogRex.swim(5);
        dogHilda.run(-2);
        dogRex.swim(0);
    }
}
