package ru.framework.my;

/*
Самый главный класс, от которого наследуются все юниты
Может быть наследован и использоваться для создания простых юнитов(как ветер, дождь)
Которые распространяются на всю локацию
 */
public abstract class MUnit {
    private static long count = 1;
    private long id = count++;
    protected MLocation location;

    public abstract void action(String command);


    public MUnit(MLocation location){
        this.location = location;
    }

    public MLocation getLocation(){return location;}

    public long getId(){return id;}
    public static long getCount(){return count;}


}
