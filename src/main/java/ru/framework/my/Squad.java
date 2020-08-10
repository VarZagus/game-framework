package ru.framework.my;

import java.util.ArrayList;

/**
 * Класс Squad
 * Позволяет добавлять юнитов в определённую группу
 * чтобы отдавать им одну и ту же команду
 */

public class Squad {
    private ArrayList<Actionable> units = new ArrayList<>();

    public void addUnit(Actionable ... unit){
        for(Actionable u : unit) units.add(u);
    }

    public void sendCommand(String command){
        for(Actionable a : units) a.action(command);
    }
}
