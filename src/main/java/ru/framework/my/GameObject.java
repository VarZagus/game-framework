package ru.framework.my;

/**
 * Объект. Может использоваться для создания различных декораций на карте.
 * Например камни, деревеья, постройки и т.д.
 * Соответственно имеет только два состояния - позиция и сама локация.
 */
public abstract class GameObject extends Unit{
    protected Position position = new Position();

    public GameObject(Location location, int x, int y){
        super(location);
        position.x  = x;
        position.y = y;
    }

    public int getPositionX() {
        return position.x;
    }

    public int getPositionY() {
        return position.y;
    }

    public void setPositionX(int x) {
        if(x < 0 || x > location.getWidth()){
            throw new UnitInOutsideException();
        }
        position.x = x;
    }
    public void setPositionY(int y){
        if(y < 0 || y > location.getHeight()){
            throw new UnitInOutsideException();
        }
        position.y = y;
    }

}
