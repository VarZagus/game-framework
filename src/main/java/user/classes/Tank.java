package user.classes;

import ru.framework.my.*;

import java.util.HashMap;
import java.util.Map;

public class Tank extends CombatUnit implements Actionable {


    public Tank(Location location, int x, int y, Orientation orientation, int amm) {
        super(location, x, y, orientation, amm);
    }

    @Override
    public void action(String command) {
        if(command.equals("T")){
            turnClockwise();
        } else if(command.equals("A")){
            shoot();
        } else if(command.equals("F")){
            moveForwards();
        }
    }

    @Override
    public Map<String,String> getAvailableCommands() {
        Map<String,String> map = new HashMap<>();
        map.put("T","turnClockwise");
        map.put("A","shoot");
        map.put("F","moveForwards");
        return map;
    }
}
