package cn.yyj.game.Map;
import java.util.LinkedList;

public class SpringMap extends CityMap{

    LinkedList<Position> listPosition;

    public SpringMap(){
        this.setName("草原");
        //初始化地图所有坐标
        this.listPosition = new LinkedList<Position>();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                this.listPosition.add(new Position(i, j, 0));
            }
        }

        //初始化地图入口坐标和出口坐标
        this.entrancePosition = new Position(0,0,0);
        this.exitPosition.add(new Position(10,10,0));
    }

    @Override
    public boolean isVaildPosition(Position position) {
        for(Position p : listPosition){
            if(p.equals(position))
                return true;
        }
        System.out.println("当前地图下，该地点不可到达！请重新选择...");
        return false;
    }
}
