package model;

import exceptions.InvalidInputInfo;
import model.enums.Location;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRoute {

    private final int id;
    private static int counter = 1;
    private final List<RouteStop> stops;
    private Integer assignedTruckId;
    final List<DeliveryPackage> packages;
    int totalDistanceKm;

    public DeliveryRoute(List<RouteStop> stops, Integer assignedTruckId, List<DeliveryPackage> packages, int totalDistanceKm){
        this.id = counter;
        counter++;
        if (stops.size() < 2){throw new InvalidInputInfo("There must be at least 2 stops.");}
        this.stops = new ArrayList<>(stops);
        this.assignedTruckId = assignedTruckId;
        this.packages = new ArrayList<>(packages);
        this.totalDistanceKm = totalDistanceKm;
    }

}
