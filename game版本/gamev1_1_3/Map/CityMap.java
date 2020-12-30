package cn.yyj.game.Map;

import java.util.LinkedList;

public class CityMap extends Map {
    LinkedList<Position> exitPosition;

    public CityMap(){
        this.setMapType("城镇");
        this.exitPosition = new LinkedList<Position>();
    }

    public LinkedList<Position> getExitPosition() {
        return exitPosition;
    }

    public void setExitPosition(LinkedList<Position> exitPosition) {
        this.exitPosition = exitPosition;
    }
}
