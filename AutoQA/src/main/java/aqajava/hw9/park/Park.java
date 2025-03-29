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
    public void addAttractions(String attractionName, String attractionWorkingHours, double attractionCost) {
        Attraction attraction = new Attraction(attractionName, attractionWorkingHours, attractionCost);
        parkAttractions.add(attraction);
    }

    public void getFullInfoOnParkAttractions() {
        for(Attraction attraction: parkAttractions) {
            System.out.println(attraction.toString());
        }
    }

    public void getParkAttractionsNames(){
        for(Attraction attraction: parkAttractions) {
            System.out.println(attraction.getAttractionName());
        }
    }

    public void getParticularAttractionInfo(String attractionName){
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
            this.getFullInfoOnParkAttractions();
        }
    }

    public void getParticularAttractionCost(String attractionName) {
        for(Attraction attraction: parkAttractions) {
            if(attraction.getAttractionName().equals(attractionName)) {
                System.out.print("The cost of " + attractionName + " ride is ");
                System.out.println(attraction.attractionCost + ".");
                break;
            }
        }
        if(!attractionNames.contains(attractionName)) {
            System.out.println("There is no " + attractionName + " attraction in our park. Here is what we can offer you: ");
            this.getFullInfoOnParkAttractions();
        }
    }

    public void getParticularAttractionHours(String attractionName) {
        for(Attraction attraction: parkAttractions) {
            if(attraction.getAttractionName().equals(attractionName)) {
                System.out.print("The working hours of " + attractionName + " is ");
                System.out.println(attraction.attractionWorkingHours + ".");
                break;
            }
        }
        if(!attractionNames.contains(attractionName)) {
            System.out.println("There is no " + attractionName + " attraction in our park. Here is what we can offer you: ");
            this.getFullInfoOnParkAttractions();
        }
    }

    private class Attraction{
        String attractionName;
        String attractionWorkingHours;
        double attractionCost;

        public Attraction(String attractionName, String attractionWorkingHours, double attractionCost) {
            this.attractionName = attractionName;
            this.attractionWorkingHours = attractionWorkingHours;
            this.attractionCost = attractionCost;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getAttractionWorkingHours() {
            return attractionWorkingHours;
        }

        public double getAttractionCost() {
            return attractionCost;
        }

        @Override
        public String toString() {
            return "Attraction " + attractionName +
                    ", Working hours: " + attractionWorkingHours +
                    ", Cost: " + attractionCost;
        }
    }
}
