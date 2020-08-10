package user.classes;

import ru.framework.my.Actionable;
import ru.framework.my.Actioner;
import ru.framework.my.Location;
import ru.framework.my.Orientation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class DefendTower extends CombatUnit implements Actionable {


    public DefendTower(Location location, int x, int y, Orientation orientation, int amm) {
        super(location, x, y, orientation,amm);
    }


    @Override
    public void action(String command) {
        if(command.equals("T")){
            turnClockwise();
        } else if(command.equals("A")){
            shoot();
        }
    }

    @Override
    public Map<String,String> getAvailableCommands() {
        Map<String,String> map = new HashMap<>();
        map.put("T","turnClockwise");
        map.put("A","shoot");
        return map;
    }

}
