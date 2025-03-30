package aqajava.hw9.park;

public class ParkMain {
    public static void main(String[] args) {
        Park park1 = new Park("Gorky Park", "Chelyuskintsev subway station");
        park1.addAttractions("Waltz", "We - Su, 11:00 - 19:00", 4.50, "Gorky Park");
        park1.addAttractions("Kolobok", "We - Su, 10:00 - 19:00", 2., "Gorky Park");
        park1.addAttractions("Ferris Wheel", "Tu - Su, 11:00 - 20:00", 4., "Gorky Park");

        // get full info on all attractions
        park1.getFullInfo();

        // get names of all park attractions
        park1.getNames();

        // get info on a particular attraction
        park1.getAttractionInfo("Ferris Wheel");
        park1.getAttractionInfo("Super 8");

        //get cost of a particular attraction
        park1.getCost("Kolobok");
        park1.getCost("Chains");

        // get working hours of a particular attraction
        park1.getSchedule("Ferris Wheel");
        park1.getSchedule("Race");
    }
}
