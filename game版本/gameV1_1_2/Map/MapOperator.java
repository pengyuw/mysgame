package cn.yyj.game.Map;

import java.util.LinkedList;

public class MapOperator {
    LinkedList<Map> listMap;

    public MapOperator(){
        listMap = new LinkedList<Map>();
        listMap.add(new FreshVillage());
    }
    public Map loadMap(String mapName){
        for(Map m : listMap){
            if(m.getName().equals(mapName)){
                System.out.println("进入地图【"+m.getName()+"】！");
                m.introduction();
                return m;
            }
        }
        return null;
    }
}
