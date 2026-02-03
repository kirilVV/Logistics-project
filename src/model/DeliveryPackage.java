package model;

import exceptions.InvalidInputInfo;
import model.enums.Location;

public class DeliveryPackage {
    private int id;
    private static int counter = 1;
    private final Location startLocation;
    private final Location endLocation;
    private final int weightKg;
    private final CustomerContact contact;


    public DeliveryPackage( Location startLocation, Location endLocation, int weightKg, CustomerContact contact) {
        this.id = counter;
        counter++;
        if (startLocation == null) {throw new InvalidInputInfo("There must be starting Location");}
        this.startLocation = startLocation;
        if (endLocation == null){throw new InvalidInputInfo("There must be final Location");}
        this.endLocation = endLocation;
        if (weightKg <= 0 ) {throw new InvalidInputInfo("Weight can't be 0 or less.");}
        this.weightKg = weightKg;
        this.contact = contact;
    }

    public DeliveryPackage(Location startLocation, Location endLocation, int weightKg){
        this(startLocation, endLocation, weightKg, null);
    }

    public int getId() {
        return id;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public CustomerContact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        String description;
        if (contact != null){
            description= "DeliveryPackage{" +
                    "startLocation=" + startLocation +
                    ", endLocation=" + endLocation +
                    ", weightKg=" + weightKg +
                    ", contact=" + contact +
                    '}';
        }
        else {
            description = "DeliveryPackage{" +
                    "startLocation=" + startLocation +
                    ", endLocation=" + endLocation +
                    ", weightKg=" + weightKg +
                    '}';
        }
        return description;
    }
}
