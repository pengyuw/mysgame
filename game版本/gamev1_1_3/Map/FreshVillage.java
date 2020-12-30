package cn.yyj.game.Map;

import cn.yyj.game.Event.Event;
import cn.yyj.game.Event.IllustrationEvent;
import cn.yyj.game.Obstacle.Obstacle;
import javafx.geometry.Pos;

import java.util.LinkedList;

public class FreshVillage extends CityMap {

    LinkedList<Position> listPosition;  //存放地图所有坐标

    public FreshVillage(){
        this.setName("新手村");
        this.listPosition = new LinkedList<Position>();
        //1. 初始化基本坐标
        for(int i=0; i<=10; i++){
            this.listPosition.add(new Position(i, 0, 0, new Event(), new Obstacle()));
        }
        //2. 更新事件坐标
        updatePositionObjectForEvent(new Position(0,0,0, new IllustrationEvent("【提示】当前位置是新手村入口"), new Obstacle()));
        updatePositionObjectForEvent(new Position(5,0,0, new IllustrationEvent("【提示】村长正在路边闲聊"), new Obstacle()));
    }

    @Override
    public void updatePositionObjectForEvent(Position position){
        for (Position p : listPosition) {
            if (p.equals(position)) {
                listPosition.remove(p);
                listPosition.add(position);
                return;
            }
        }
    }
    @Override
    public Position getPositionObjectForXYZ(int x, int y, int z) {
        for (Position p : listPosition) {
            if (p.equals(new Position(x, y, z)))
                return p;
        }
        return null;
    }
    @Override
    public Position getPositionObjectForXYZ(Position position) {
        for (Position p : listPosition) {
            if (p.equals(position))
                return p;
        }
        return null;
    }
    @Override
    public boolean isVaildPosition(Position position) {
        for(Position p : listPosition){
            if(p.equals(position))
                return true;
        }
        System.out.println("[root@GameWorld]:# 当前地图下，该地点不可到达！请重新选择...");
        return false;
    }
    @Override
    public void introduction() {
        System.out.println();
        System.out.println("【提示】新手村地处偏僻，若想出村，请去找村长【坐标】【5,0,0】寻求帮助。");
        System.out.println();
    }
}
