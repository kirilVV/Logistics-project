package app;

import model.CustomerContact;
import model.DeliveryPackage;
import model.Truck;
import model.enums.Location;
import model.enums.TruckModel;
import model.enums.TruckStatus;

public class Main {
    public static void main(String[] args) {
        Truck Mama = new Truck(TruckModel.SCANIA);
        System.out.println(Mama);
    }
}
