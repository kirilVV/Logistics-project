package model;

import model.enums.Location;

public class DeliveryPackage {
    private final int uinqueId;
    private final Location startLocation;
    private final Location endLocation;
    private final int weightKg;
    private final CustomerContact contact;


    public DeliveryPackage(int uinqueId, Location startLocation, Location endLocation, int weightKg, CustomerContact contact) {
        this.uinqueId = uinqueId;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.weightKg = weightKg;
        this.contact = contact;
    }
}
