package ru.test.framework.my;
import ru.framework.my.*;
import user.classes.*;

import javax.sound.midi.Soundbank;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Location location = new Location(8,8);
        Tractor tractor = new Tractor(location,2,2,Orientation.NORTH);
        Tank tank = new Tank(location,3,1,Orientation.NORTH, 25);
        DefendTower tower = new DefendTower(location,2,1,Orientation.EAST,30);

        Squad squad = new Squad();
        squad.addUnit(tractor,tank,tower);

        System.out.println("Before:");
        System.out.println("Tractor " + tractor.getPositionX() + " " + tractor.getPositionY() + " " + tractor.getOrientation());
        System.out.println("Tank " + tank.getPositionX() + " " + tank.getPositionY() + " " + tank.getOrientation());
        System.out.println("Tower " + tower.getPositionX() + " " + tower.getPositionY() + " " + tower.getOrientation());
        System.out.println();

        squad.sendCommand("F");
        squad.sendCommand("T");

        System.out.println("After:");
        System.out.println("Tractor " + tractor.getPositionX() + " " + tractor.getPositionY() + " " + tractor.getOrientation());
        System.out.println("Tank " + tank.getPositionX() + " " + tank.getPositionY() + " " + tank.getOrientation());
        System.out.println("Tower " + tower.getPositionX() + " " + tower.getPositionY() + " " + tower.getOrientation());
        System.out.println();


    }
}
