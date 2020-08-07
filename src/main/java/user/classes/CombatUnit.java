package user.classes;

import ru.framework.my.MActioner;
import ru.framework.my.MLocation;
import ru.framework.my.MOrientation;

public abstract class CombatUnit extends MActioner {
    private int ammunition;

    public CombatUnit(MLocation location, int x, int y, MOrientation orientation, int ammunition) {
        super(location, x,y);
        this.orientation = orientation;
        this.ammunition = ammunition;
    }

    public int getAmmunition(){return ammunition;}
    public void shoot(){}

}
