package model;

import model.enums.Location;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RouteStop {
    private final Location city;
    private final LocalDateTime time;

    public RouteStop(Location city, LocalDateTime time){
        this.city=city;
        this.time = time;

    }

    public Location getCity(){
        return city;
    }

    public LocalDateTime getTime(){
        return time;
    }
}
