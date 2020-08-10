package ru.framework.my;

/**
 *Локация, определяет размер карты.
 */

public class Location {

    private int height;
    private int width;

    public Location(int h, int w){
        height = h;
        width = w;
    }

    public int getHeight(){return height;}

    public int getWidth(){return width;}

}
