package ru.framework.my;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Wind extends Unit implements Actionable{
    private Orientation orientation;

    public Wind(Location location, Orientation orientaion) {
        super(location);
        this.orientation = orientaion;
    }


    @Override
    public void action(String command) {
        if (command.equals("N")){
            this.orientation = Orientation.NORTH;
        } else if (command.equals("S")){
            this.orientation = Orientation.SOUTH;
        } else if (command.equals("W")){
            this.orientation = Orientation.WEST;
        } else if (command.equals("E")){
            this.orientation = Orientation.EAST;
        }
    }

    @Override
    public Map<String,String> getAvailableCommands() {
        Map<String,String> map = new HashMap<>();
        map.put("N","setNorth");
        map.put("S","setSouth");
        map.put("W","setWest");
        map.put("E","setEast");
        return map;
    }

    public Orientation getOrientation(){
        return this.orientation;
    }

}
