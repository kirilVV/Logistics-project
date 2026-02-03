package model;

import exceptions.InvalidInputInfo;
import model.enums.TruckModel;
import model.enums.TruckStatus;

public class Truck {

    private TruckModel model;
    private int capacityKg;
    private int maxRange;
    private TruckStatus status;

    public Truck(TruckModel model){
        switch (model)
        {
            case SCANIA:
                this.model = TruckModel.SCANIA;
                this.capacityKg = 42000;
                this.maxRange = 8000;
                break;
            case MAN:
                this.model = TruckModel.MAN;
                this.capacityKg = 37000;
                this.maxRange = 10000;
                break;
            case ACTROS:
                this.model = TruckModel.ACTROS;
                this.capacityKg = 26000;
                this.maxRange = 13000;
                break;
            default:
                throw new InvalidInputInfo("Truck models are: SCANIA, MAN, ACTROS");
        }
        this.status = TruckStatus.FREE;
    }

    public TruckModel getModel() {
        return model;
    }

    public int getCapacityKg() {
        return capacityKg;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public TruckStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model=" + model +
                ", capacityKg=" + capacityKg +
                ", maxRange=" + maxRange +
                ", status=" + status +
                '}';
    }
}
