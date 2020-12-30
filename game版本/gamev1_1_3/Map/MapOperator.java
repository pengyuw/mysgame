package cn.yyj.game.Map;

import cn.yyj.game.Event.Event;
import cn.yyj.game.Event.IllustrationEvent;
import cn.yyj.game.Player.Player;
import cn.yyj.game.common.Game;

import java.util.LinkedList;

public class MapOperator {
    LinkedList<Map> listMap;

    // 添加地图
    public MapOperator(){
        listMap = new LinkedList<Map>();
        listMap.add(new FreshVillage());
        listMap.add(new SiriusHome());
        listMap.add(new SpringMap());
        listMap.add(new UndergroundPrison());
        listMap.add(new WareHouse());
    }

    public Map loadMap(String mapName) throws InterruptedException {
        for(Map m : listMap){
            if(m.getName().equals(mapName)){
                System.out.println("[root@GameWorld]:# 进入地图【"+m.getName()+"】！");
                m.introduction();
                return m;
            }
        }
        return null;
    }

    public boolean checkCurrentPositionForEvent(Position position, Map map){

        Position p = map.getPositionObjectForXYZ(position.getX(), position.getY(), position.getZ());

        if(p.getEvent().getEventSwitch() == true){
            if(p.getEvent().getEventType() == 1) {
                handleIllustrationEvent(p.getEvent());
            }
            return true;
        } else{
            return false;
        }
    }

    public void handleIllustrationEvent(Event event){
        String des = ((IllustrationEvent)event).getDescription();
        Game.reporter(des);
    }
}
