package cn.yyj.game.Map;

import cn.yyj.game.Event.Event;
import cn.yyj.game.Event.IllustrationEvent;
import cn.yyj.game.Obstacle.Obstacle;
import cn.yyj.game.Player.Player;
import java.util.LinkedList;

public class WareHouse extends CityMap{

    LinkedList<Position> listPosition;
    Player player;

    public WareHouse(){
        this.setName("破旧的仓库");
        this.listPosition = new LinkedList<>();
        // 3*3地图
        for(int i=10; i<13; i++){
            for(int j=0; i<3; j++) {
                if(i==10 && j==0){
                    this.listPosition.add(new Position(i, j, 0, new IllustrationEvent("【提示】当前位置【10,0,0】。" +
                            "这是一间破旧的厂库，到处布满了灰尘。在【12，0，0】与【12，1，0】处似乎隐藏着什么东西。【12，3，0】处还有一扇门，似乎通向另一个房间"), new Obstacle()));
                } else if(i==12 && j==0){
                    this.listPosition.add(new Position(12,0,0, new IllustrationEvent("【提示】当前位置【12，0，0】。" +
                            "你捡到了一块破旧的头盔，获得防御力+5"), new Obstacle()));
                    //player.addDefend(5);
                } else if(i==12 && j==1){
                    this.listPosition.add(new Position(12,1,0,new IllustrationEvent("【提示】当前位置【12，1，0】" +
                            "你奋力的拨开布满灰尘的货物，在货物最底下发现了一快闪闪发亮的玻璃碎片。该碎片可用来攻击或隔断绳索，获得攻击力+5"),new Obstacle()));
                    //player.addAttack(5);
                } else if(i==12 && j==3){
                    this.listPosition.add(new Position(12,3,0, new IllustrationEvent("【提示】当前位置【12，3，0】。+" +
                            "在最东边你隐约看到了一个楼梯，一直在牢房里关着的你似乎有了一线希望"),new Obstacle()));
                }
            }
        }

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
        Thread.currentThread().sleep(2000);
        System.out.println("【提示】一股刺鼻的灰尘扑面而来");
        Thread.currentThread().sleep(2000);
        System.out.println("【提示】这是一间3米*3米的小仓库，似乎已经废弃了很久。");
        System.out.println();
    }

}
