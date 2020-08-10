package user.classes;

import ru.framework.my.Actioner;;
import ru.framework.my.Location;
import ru.framework.my.Orientation;

public abstract class CombatUnit extends Actioner {
    private int ammunition;

    public CombatUnit(Location location, int x, int y, Orientation orientation, int ammunition) {
        super(location, x,y);
        this.orientation = orientation;
        this.ammunition = ammunition;
    }

    public int getAmmunition(){return ammunition;}
    public void shoot(){
        System.out.println("FIRE!!!");
    }

}
