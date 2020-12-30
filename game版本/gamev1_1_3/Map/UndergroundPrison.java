package cn.yyj.game.Map;

import cn.yyj.game.Event.Event;
import cn.yyj.game.Event.IllustrationEvent;
import cn.yyj.game.Obstacle.Obstacle;

import java.util.LinkedList;

public class UndergroundPrison extends CityMap{

    LinkedList<Position> listPosition;  //存放地图所有坐标

    public UndergroundPrison(){
        this.setName("地下监牢");
        this.listPosition = new LinkedList<Position>();
        //1. 初始化可通行道路
        //监牢
        for(int i=0; i<3; i++){
            //监牢内部
            this.listPosition.add(new Position(0+i*3, 0, 0, new IllustrationEvent("【提示】当前位置【0,0,0】。这是一间2x2的牢房，牢门在西北角【-1,1,0】"), new Obstacle()));
            this.listPosition.add(new Position(0+i*3, 1, 0, new Event(), new Obstacle()));
            this.listPosition.add(new Position(-1+i*3, 0, 0, new Event(), new Obstacle()));
            this.listPosition.add(new Position(-1+i*3, 1, 0, new IllustrationEvent("【提示】石门在北侧，是开着的"), new Obstacle()));
            //牢门
            this.listPosition.add(new Position(-1+i*3, 2, 0, new IllustrationEvent("【提示】再迈一步，走出监牢"), new Obstacle()));
        }
        //牢道
        for(int i=0; i<9; i++)
            if(i==0)
                this.listPosition.add(new Position(-1+i, 3, 0, new IllustrationEvent("【提示】这是牢门口。独有向东一条昏暗狭长的隧道，小心翼翼些，或许能够出去..."), new Obstacle()));
            else if(i==3)
                this.listPosition.add(new Position(-1+i, 3, 0, new IllustrationEvent("【提示】还在隧道。隧道南侧又一处铁门。里面好像有一死尸，不断散发着恶臭味..."), new Obstacle()));
            else
                this.listPosition.add(new Position(-1+i, 3, 0, new IllustrationEvent("【提示】还在隧道"), new Obstacle()));
        //审讯室
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(i==0 && j==0)
                    this.listPosition.add(new Position(8+i, 3-j, 0, new IllustrationEvent("【提示】看起来像审讯室。大小3x4，桌上【9,2,0】好像有些东西。出口在审讯室南侧【9,0,0】"), new Obstacle()));
                else
                    this.listPosition.add(new Position(8+i, 3-j, 0, new Event(), new Obstacle()));
            }
        }
        //牢道
        for(int i=0; i<7; i++) {
            if(i==6)
                this.listPosition.add(new Position(8, -1 - i, 0, new IllustrationEvent("到了一处拐角。拐角一直向东延伸"), new Obstacle()));
            else
                this.listPosition.add(new Position(8, -1 - i, 0, new IllustrationEvent("【提示】隧道越来越窄"), new Obstacle()));
        }
        for(int i=0; i<16; i++) {
            if(i== 15)
                this.listPosition.add(new Position(9 + i, -7, 0, new IllustrationEvent("终于出来了！"), new Obstacle()));
            else
                this.listPosition.add(new Position(9 + i, -7, 0, new IllustrationEvent("【提示】隧道前方好像有亮光！"), new Obstacle()));
        }

        //2. 初始化墙壁
        //略

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
    public void introduction() throws InterruptedException {
        System.out.println();
        Thread.currentThread().sleep(2500);
        System.out.println("【提示】你慢慢苏醒过来...");
        Thread.currentThread().sleep(2500);
        System.out.println("【提示】空气中弥漫着血腥恶臭的味道，令人呼吸不爽...");
        Thread.currentThread().sleep(2500);
        System.out.println("【提示】微光之下，壁上和足底潮湿至极...");
        Thread.currentThread().sleep(2500);
        System.out.println("【提示】除了呼吸声，周围死一般的寂静...");
        Thread.currentThread().sleep(2500);
        System.out.println("【提示】逃离这座地下监牢。");
        Thread.currentThread().sleep(2500);
        System.out.println();
    }

}
