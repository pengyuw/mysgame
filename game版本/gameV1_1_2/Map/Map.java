package cn.yyj.game.Map;

public class Map {
    String name;
    String mapType;
    Position entrancePosition;

    public Map(){
        this.entrancePosition = new Position();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public Position getEntrancePosition() {
        return entrancePosition;
    }

    public void setEntrancePosition(Position entrancePosition) {
        this.entrancePosition = entrancePosition;
    }

    public boolean isVaildPosition(Position position){ return false; };

    public void introduction(){}

}
