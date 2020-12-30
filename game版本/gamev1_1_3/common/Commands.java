package cn.yyj.game.common;

import java.util.LinkedList;

public class Commands {

    public LinkedList<String> commandsList;

    public static final String GO_EAST = "向东";
    public static final String GO_NORTH = "向北";
    public static final String GO_WEST = "向西";
    public static final String GO_SOUTH = "向南";
    public static final String CHECK_BAG = "背包";    //增加背包
    public static final String CHECK_STORE = "商店";
    public static final String CHECK_STATE = "状态";
    public static final String CHECK_INVESTIGATE = "调查";

    public Commands(){
        commandsList = new LinkedList<String>();
        commandsList.add(GO_EAST);
        commandsList.add(GO_NORTH);
        commandsList.add(GO_SOUTH);
        commandsList.add(GO_WEST);
        commandsList.add(CHECK_STATE);
        commandsList.add(CHECK_STORE);
        commandsList.add(CHECK_BAG);
        commandsList.add(CHECK_INVESTIGATE);
    }

    public LinkedList<String> getCommandsList() {
        return commandsList;
    }

    public void setCommandsList(LinkedList<String> commandsList) {
        this.commandsList = commandsList;
    }
}
