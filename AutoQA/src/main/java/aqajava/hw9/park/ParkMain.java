package aqajava.hw9.park;

public class ParkMain {
    public static void main(String[] args) {
        Park park1 = new Park("Gorky Park", "Chelyuskintsev subway station");
        park1.addAttractions("Waltz", "We - Su, 11:00 - 19:00", 4.50);
        park1.addAttractions("Kolobok", "We - Su, 10:00 - 19:00", 2.);
        park1.addAttractions("Ferris Wheel", "Tu - Su, 11:00 - 20:00", 4.);

        // get full info on all attractions
        park1.getFullInfoOnParkAttractions();

        // get names of all park attractions
        park1.getParkAttractionsNames();

        // get info on a particular attraction
        park1.getParticularAttractionInfo("Ferris Wheel");
        park1.getParticularAttractionInfo("Super 8");

        //get cost of a particular attraction
        park1.getParticularAttractionCost("Kolobok");
        park1.getParticularAttractionCost("Chains");

        // get working hours of a particular attraction
        park1.getParticularAttractionHours("Ferris Wheel");
        park1.getParticularAttractionHours("Race");
    }
}
