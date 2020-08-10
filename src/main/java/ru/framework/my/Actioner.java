package ru.framework.my;
/**
 *Этот используется для создания продвинутых юнитов,
 *которые могут перемещаться по карте и/или поворачиваться.
 */
public abstract class Actioner extends GameObject {
    protected Orientation orientation = Orientation.NORTH;

    public Actioner(Location location, int x, int y){
        super(location,x,y);
    }

    public void turnClockwise() {
        if (orientation == Orientation.NORTH) {
            orientation = Orientation.EAST;
        } else if (orientation == Orientation.EAST) {
            orientation = Orientation.SOUTH;
        } else if (orientation == Orientation.SOUTH) {
            orientation = Orientation.WEST;
        } else if (orientation == Orientation.WEST) {
            orientation = Orientation.NORTH;
        }
    }

    public void moveForwards() {
        if (orientation == Orientation.NORTH) {
            position.y++;
        } else if (orientation == Orientation.EAST) {
            position.x++;
        } else if (orientation == Orientation.SOUTH) {
            position.y--;
        } else if (orientation == Orientation.WEST) {
            position.x--;
        }
        if (position.x > getLocation().getWidth() || position.y > getLocation().getHeight() || position.x < 0 || position.y < 0) {
            throw new UnitInOutsideException();
        }
    }

    public Orientation getOrientation(){return this.orientation;}


}
