package ru.framework.my;

public class Tractor extends MActioner {


    public Tractor(MLocation location, int x, int y, MOrientation orientation) {
        super(location, x, y);
        this.orientation = orientation;
    }

    @Override
    public void action(String command) {
        if(command == "T"){
            turnClockwise();
        } else if (command == "F"){
            moveForwards();
        }
    }
}
