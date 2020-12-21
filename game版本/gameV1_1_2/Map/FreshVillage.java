package cn.yyj.game.Map;

import cn.yyj.game.common.Game;

import java.util.LinkedList;

/**
 * @description: 地图示例：新手村
 *  注：地图包含元素：位置【Position】事件【Action】
 */
public class FreshVillage extends CityMap {

    LinkedList<Position> listPosition;

    public FreshVillage(){
        this.setName("新手村");
        this.listPosition = new LinkedList<Position>();                 //初始化地图所有坐标
        for(int i=0; i<=10; i++)
            this.listPosition.add(new Position(i, 0, 0));

        this.listPosition.add(new Position(3,2,5));

        this.entrancePosition = new Position(0,0,0);            //初始化地图入口坐标和出口坐标
        this.exitPosition.add(new Position(10,0,0));
    }

    @Override
    public boolean isVaildPosition(Position position) {
        for(Position p : listPosition){
            if(p.equals(position))
                return true;
        }
        Game.reporter("当前地图下，该地点不可到达！请重新选择...");
        return false;
    }

    @Override
    public void introduction() {
        Game.reporter("新手村地处偏僻，若想出村，得去找村长【坐标】【5,0,0】寻求帮助。");
    }
}
