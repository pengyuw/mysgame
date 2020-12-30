package cn.yyj.game.Player;

import cn.yyj.game.Map.FreshVillage;
import cn.yyj.game.Map.Map;
import cn.yyj.game.Map.MapOperator;
import cn.yyj.game.Map.Position;

import java.util.Scanner;

/**
 * @description: 操作类：玩家所有操作
 */
public class PlayOperator {

    public void showPosition(Player player){
        System.out.println("[root@GameWorld]:# 您当前位置为"+player.getPosition().toString());
    }

    /**
     * @descrption: 玩家移动多步：向北‘向东、向西、向南
     *  1. 检查目的坐标是否合法（在地图内）
     *  2. 检查路径之间是否有障碍物
     *  3. 没有问题后，更新player位置
     */
    public void moveEastMoreStep(Player player, Map map){
        System.out.println("[root@GameWorld]:# 请问向东移动几步？");
        System.out.print("命令：");
        int stepNumber = getIntFromScanner();

        Position tempPos = new Position(
                player.getPosition().getX()+stepNumber,
                player.getPosition().getY(),
                player.getPosition().getZ()
        );
        if(!map.isVaildPosition(tempPos)){
            return;
        }
        player.setPosition(map.getPositionObjectForXYZ(tempPos));
        showPosition(player);
    }
    public void moveWestMoreStep(Player player, Map map){
        System.out.println("[root@GameWorld]:# 请问向西移动几步？");
        System.out.print("命令：");
        int stepNumber = getIntFromScanner();

        Position tempPos = new Position(
                player.getPosition().getX()-stepNumber,
                player.getPosition().getY(),
                player.getPosition().getZ()
        );
        if(!map.isVaildPosition(tempPos)){
            return;
        }
        player.setPosition(map.getPositionObjectForXYZ(tempPos));
        showPosition(player);
    }
    public void moveNorthMoreStep(Player player, Map map){
        System.out.println("[root@GameWorld]:# 请问向北移动几步？");
        System.out.print("命令：");
        int stepNumber = getIntFromScanner();

        Position tempPos = new Position(
                player.getPosition().getX(),
                player.getPosition().getY()+stepNumber,
                player.getPosition().getZ()
        );
        if(!map.isVaildPosition(tempPos)){
            return;
        }
        player.setPosition(map.getPositionObjectForXYZ(tempPos));
        showPosition(player);
    }
    public void moveSouthMoreStep(Player player, Map map){
        System.out.println("[root@GameWorld]:# 请问向南移动几步？");
        System.out.print("命令：");
        int stepNumber = getIntFromScanner();

        Position tempPos = new Position(
                player.getPosition().getX(),
                player.getPosition().getY()-stepNumber,
                player.getPosition().getZ()
        );
        if(!map.isVaildPosition(tempPos)){
            return;
        }
        player.setPosition(map.getPositionObjectForXYZ(tempPos));
        showPosition(player);
    }

    /**
     * @description: 查看人物状态，即人物详细信息
     */
    public void checkPlayerInformation(Player p){
        System.out.println("/*******************************/");
        System.out.println("/*/\t姓名：\t"+p.getName());
        System.out.println("/*/\t职业：\t"+p.getProfession());
        System.out.println("/*/\t等级：\t"+p.getLevel());
        System.out.println("/*/\t状态：\t"+p.getState());
        System.out.println("/*/\t金币：\t"+p.getMoney());
        System.out.println("/*******************************/");
    }
    public String getStringFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.next();
    }
    public int getIntFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }


}
