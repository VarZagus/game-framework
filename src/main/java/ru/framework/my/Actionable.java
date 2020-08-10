package ru.framework.my;

import java.util.Map;


/**
 * Интерфейс Actionable
 * Его нужно имплементить всем единицам
 * которые способны выполнять команды
 */

public interface Actionable {
    void action(String command);
     Map<String,String> getAvailableCommands();
}
