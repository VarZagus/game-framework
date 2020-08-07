package ru.framework.my;

import java.util.ArrayList;

//Локация, определяет размер карты.
public class MLocation {

    private int height;
    private int width;

    public MLocation(int h, int w){
        height = h;
        width = w;
    }

    public int getHeight(){return height;}

    public int getWidth(){return width;}

}
