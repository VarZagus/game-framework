package ru.framework.my;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tractor extends Actioner implements Actionable {


    public Tractor(Location location, int x, int y, Orientation orientation) {
        super(location, x, y);
        this.orientation = orientation;
    }

    @Override
    public void action(String command) {
        if(command.equals("T")){
            turnClockwise();
        } else if (command.equals("F")){
            moveForwards();
        }
    }

    @Override
    public Map<String,String> getAvailableCommands() {
        Map<String,String> map = new HashMap<>();
        map.put("T","turnClockwise");
        map.put("F","moveForwards");
        return map;
    }

}
