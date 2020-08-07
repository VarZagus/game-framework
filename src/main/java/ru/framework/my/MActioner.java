package ru.framework.my;
/*
Этот используется для создания продвинутых юнитов,
которые могут перемещаться по карте и/или поворачиваться.
 */
public abstract class MActioner extends MObject {
    protected MOrientation orientation = MOrientation.NORTH;

    public MActioner(MLocation location, int x, int y){
        super(location,x,y);
    }

    public void turnClockwise() {
        if (orientation == MOrientation.NORTH) {
            orientation = MOrientation.EAST;
        } else if (orientation == MOrientation.EAST) {
            orientation = MOrientation.SOUTH;
        } else if (orientation == MOrientation.SOUTH) {
            orientation = MOrientation.WEST;
        } else if (orientation == MOrientation.WEST) {
            orientation = MOrientation.NORTH;
        }
    }

    public void moveForwards() {
        if (orientation == MOrientation.NORTH) {
            this.position = new int[] { position[0], position[1] + 1 };
        } else if (orientation == MOrientation.EAST) {
            position = new int[] { position[0] + 1, position[1] };
        } else if (orientation == MOrientation.SOUTH) {
            position = new int[] { position[0], position[1] - 1 };
        } else if (orientation == MOrientation.WEST) {
            position = new int[] { position[0] - 1, position[1] };
        }
        if (position[0] > getLocation().getWidth() || position[1] > getLocation().getHeight() || position[0] < 0 || position[1] < 0) {
            throw new UnitInOutsideException();
        }
    }

    public MOrientation getOrientation(){return this.orientation;}


}
