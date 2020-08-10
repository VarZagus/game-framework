package ru.framework.my;

/**
 *Самый главный класс, от которого наследуются все юниты
 *Может быть наследован и использоваться для создания простых юнитов(как ветер, дождь)
 *Которые распространяются на всю локацию
 */
public abstract class Unit {
    private static long count = 1;
    private long id = count++;
    protected Location location;



    public Unit(Location location){
        this.location = location;
    }

    public Location getLocation(){return location;}

    public long getId(){return id;}
    public static long getCount(){return count;}


}
