package ru.framework.my;

public class MWind extends MUnit{
    private MOrientation orientation;

    public MWind(MLocation location, MOrientation orientaion){
        super(location);
        this.orientation = orientaion;
    }

    @Override
    public void action(String command) {
        if (command == "N"){
            this.orientation = MOrientation.NORTH;
        } else if (command == "S"){
            this.orientation = MOrientation.SOUTH;
        } else if (command == "W"){
            this.orientation = MOrientation.WEST;
        } else if (command == "E"){
            this.orientation = MOrientation.EAST;
        }
    }

    public MOrientation getOrientation(){
        return this.orientation;
    }

}
