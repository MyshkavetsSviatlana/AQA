package aqajava.hw9.park;

/*
Create a Park class with an inner class, through which objects can store information
about attractions, their working hours, and costs.
 */

import java.util.ArrayList;

public class Park {
    String parkName;
    String address;
    ArrayList<Attraction> parkAttractions = new ArrayList<>();
    ArrayList<String> attractionNames = new ArrayList<>();

    public Park(String parkName, String address) {
        this.parkName = parkName;
        this.address = address;
    }

    public void addAttractions(String attractionName, String attractionWorkingHours, double attractionCost, String attractionPark) {
        Attraction attraction = new Attraction(attractionName, attractionWorkingHours, attractionCost, attractionPark);
        parkAttractions.add(attraction);
    }

    public void getFullInfo() {
        for(Attraction attraction: parkAttractions) {
            System.out.println(attraction.toString());
        }
    }

    public void getNames(){
        for(Attraction attraction: parkAttractions) {
            System.out.println(attraction.getAttractionName());
        }
    }

    public void getAttractionInfo(String attractionName){
        for(Attraction attraction: parkAttractions) {
            attractionNames.add(attraction.attractionName);
            if (attraction.getAttractionName().equals(attractionName)) {
                attractionNames.add(attraction.attractionName);
                System.out.println(attraction);
                break;
            }
        }
        if(!attractionNames.contains(attractionName)) {
            System.out.println("There is no " + attractionName + " attraction in our park. Here is what we can offer you: ");
            this.getFullInfo();
        }
    }

    public void getCost(String attractionName) {
        for(Attraction attraction: parkAttractions) {
            if(attraction.getAttractionName().equals(attractionName)) {
                System.out.print("The cost of " + attractionName + " ride is ");
                System.out.println(attraction.getAttractionCost() + ".");
                break;
            }
        }
        if(!attractionNames.contains(attractionName)) {
            System.out.println("There is no " + attractionName + " attraction in our park. Here is what we can offer you: ");
            this.getFullInfo();
        }
    }

    public void getSchedule(String attractionName) {
        for(Attraction attraction: parkAttractions) {
            if(attraction.getAttractionName().equals(attractionName)) {
                System.out.print("The working hours of " + attractionName + " is ");
                System.out.println(attraction.getAttractionSchedule() + ".");
                break;
            }
        }
        if(!attractionNames.contains(attractionName)) {
            System.out.println("There is no " + attractionName + " attraction in our park. Here is what we can offer you: ");
            this.getFullInfo();
        }
    }

    private class Attraction{
        private final String attractionName;
        String attractionSchedule;
        double attractionCost;
        String park;

        public Attraction(String attractionName, String attractionWorkingHours, double attractionCost, String park) {
            this.attractionName = attractionName;
            this.attractionSchedule = attractionWorkingHours;
            this.attractionCost = attractionCost;
            this.park = park;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getAttractionSchedule() {
            return attractionSchedule;
        }

        public double getAttractionCost() {
            return attractionCost;
        }

        @Override
        public String toString() {
            return "Attraction " + attractionName +
                    ", Working hours: " + attractionSchedule +
                    ", Cost: " + attractionCost +
                    ", Park: " + parkName;
        }
    }
}