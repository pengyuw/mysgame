package cn.yyj.game.common;

import java.util.LinkedList;

public class Commands {

    public LinkedList<String> commandsList;

    public static final String GO_EAST = "向西";
    public static final String GO_NORTH = "向北";
    public static final String CHECK_STORE = "商店";
    public static final String CHECK_STATE = "状态";

    public Commands(){
        commandsList = new LinkedList<String>();
        commandsList.add(GO_EAST);
        commandsList.add(GO_NORTH);
        commandsList.add(CHECK_STATE);
        commandsList.add(CHECK_STORE);
    }

    public LinkedList<String> getCommandsList() {
        return commandsList;
    }

    public void setCommandsList(LinkedList<String> commandsList) {
        commandsList = commandsList;
    }
}
