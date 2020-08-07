package ru.test.framework.my;
import ru.framework.my.*;
import user.classes.*;

import javax.sound.midi.Soundbank;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MLocation location = new MLocation(8,8);
        MRock rock = new MRock(location,1,1);
        Tractor tractor = new Tractor(location,2,2,MOrientation.NORTH);
        Tank tank = new Tank(location,3,1,MOrientation.NORTH, 25);
        DefendTower tower = new DefendTower(location,2,1,MOrientation.EAST,30);

        ArrayList<MUnit> team = new ArrayList<MUnit>();
        team.add(rock);
        team.add(tractor);
        team.add(tank);
        team.add(tower);

        System.out.println("Before:");
        System.out.println("Rock " + rock.getPositionX() + " " + rock.getPositionY());
        System.out.println("Tractor " + tractor.getPositionX() + " " + tractor.getPositionY() + " " + tractor.getOrientation());
        System.out.println("Tank " + tank.getPositionX() + " " + tank.getPositionY() + " " + tank.getOrientation());
        System.out.println("Tower " + tower.getPositionX() + " " + tower.getPositionY() + " " + tower.getOrientation());
        System.out.println();

        for(MUnit a : team){
            a.action("F");
            a.action("T");
        }
        System.out.println("After:");
        System.out.println("Rock " + rock.getPositionX() + " " + rock.getPositionY());
        System.out.println("Tractor " + tractor.getPositionX() + " " + tractor.getPositionY() + " " + tractor.getOrientation());
        System.out.println("Tank " + tank.getPositionX() + " " + tank.getPositionY() + " " + tank.getOrientation());
        System.out.println("Tower " + tower.getPositionX() + " " + tower.getPositionY() + " " + tower.getOrientation());
        System.out.println();


    }
}
