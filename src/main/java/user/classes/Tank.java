package user.classes;

import ru.framework.my.MActioner;
import ru.framework.my.MLocation;
import ru.framework.my.MOrientation;

public class Tank extends CombatUnit {


    public Tank(MLocation location, int x, int y, MOrientation orientation, int amm) {
        super(location, x, y, orientation, amm);
    }

    @Override
    public void action(String command) {
        if(command == "T"){
            turnClockwise();
        } else if(command == "A"){
            shoot();
        } else if(command == "F"){
            moveForwards();
        }
    }
}
