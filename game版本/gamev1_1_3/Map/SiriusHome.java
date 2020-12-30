package cn.yyj.game.Map;
import java.util.LinkedList;

/*  新手村地图
    有商店
    有养鸡场 在东边
    村长家 在正中间
    商店 在村长家5个坐标右边
    NPC 随机在村长家附近
    野怪 村子外西边20坐标外
 */
public class SiriusHome extends CityMap {

    LinkedList<Position> listPosition;

    public SiriusHome(){
        this.setName("小天狼星的村子");
        //初始化地图所有坐标
            this.listPosition = new LinkedList<Position>();
            for(int i=0; i<=10; i++){
            this.listPosition.add(new Position(i, 0, 0));
         }
        //初始化地图入口坐标和出口坐标
            this.entrancePosition = new Position(5,5,0);
            this.exitPosition.add(new Position(10,0,0));
    }
}
