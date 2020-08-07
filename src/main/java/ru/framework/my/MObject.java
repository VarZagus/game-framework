package ru.framework.my;
/*
Объект. Может использоваться для создания различных декораций на карте.
Например камни, деревеья, постройки и т.д.
Соответственно имеет только два состояния - позиция и сама локация.
 */
public abstract class MObject extends MUnit{
    protected int [] position = new int[2];

    public MObject(MLocation location, int x, int y){
        super(location);
        position[0] = x;
        position[1] = y;
    }

    public int getPositionX() {
        return position[0];
    }

    public int getPositionY() {
        return position[1];
    }

    public void setPositionX(int x) {
        if(x < 0 || x > location.getWidth()){
            throw new UnitInOutsideException();
        }
        position[0] = x;
    }
    public void setPositionY(int y){
        if(y < 0 || y > location.getHeight()){
            throw new UnitInOutsideException();
        }
        position[1] = y;
    }

}
