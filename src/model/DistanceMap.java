package model;

import model.enums.Location;

public class DistanceMap {
    int[][] distances;

    public DistanceMap(int[][] distances){
        set(Location.SYD,Location.MEL,877);
        set(Location.SYD,Location.ADL,1376);
        set(Location.SYD,Location.ASP,2762);
        set(Location.BRI,Location.BRI,909);
        set(Location.SYD,Location.DAR,3935);
        set(Location.SYD,Location.PER,4016);

        set(Location.MEL, Location.ADL, 725);
        set(Location.MEL, Location.ASP, 2255);
        set(Location.MEL, Location.BRI, 1765);
        set(Location.MEL, Location.DAR, 3752);
        set(Location.MEL, Location.PER, 3509);

        set(Location.ADL, Location.ASP, 1530);
        set(Location.ADL, Location.BRI, 1927);
        set(Location.ADL, Location.DAR, 3027);
        set(Location.ADL, Location.PER, 2785);

        set(Location.ASP, Location.BRI, 2993);
        set(Location.ASP, Location.DAR, 1497);
        set(Location.ASP, Location.PER, 2481);

        set(Location.BRI, Location.DAR, 3426);
        set(Location.BRI, Location.PER, 4311);

        set(Location.DAR, Location.PER, 4025);
    }

    private void set(Location a, Location b, int km){
        distances[a.ordinal()][b.ordinal()]=km;
        distances[b.ordinal()][a.ordinal()]=km;
    }

    public int getDistance(Location from, Location to){
        return distances[from.ordinal()][to.ordinal()];
    }
}
