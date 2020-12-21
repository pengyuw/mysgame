package cn.yyj.game.Player;

import cn.yyj.game.Map.Map;
import cn.yyj.game.Map.Position;

import java.util.Scanner;

/**
 * @description: 操作类：玩家所有操作
 */
public class PlayOperator {

    public String getStringFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.next();
    }
    public int getIntFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    /**
     * @description: 显示当前玩家位置
     */
    public void showPosition(Player player){
        System.out.println("您当前位置为"+player.getPosition().toString());
    }
    /**
     * @descrption: 玩家向北移动一步
     */
    public boolean moveNorthOneStep(Player player, Map map){
        Position tempPosition = new Position(player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
        tempPosition.setX(tempPosition.getX()+1);
        if(map.isVaildPosition(tempPosition)){
            player.setPosition(tempPosition);
            return true;
        }
        return false;
    }
    /**
     * @description: 玩家向北移动多步
     */
    public void moveNorthMoreStep(Player player, Map map){
        System.out.println("请问向北移动几步？");
        int stepNumber = getIntFromScanner();
        for(int i =0; i<stepNumber; i++)
            if(!moveNorthOneStep(player, map)){
                return;
            }
        showPosition(player);
    }
    /**
     * @descrption: 玩家向东移动一步
     */
    public boolean moveEastOneStep(Player player, Map map){
        Position tempPosition = new Position(player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
        tempPosition.setY(tempPosition.getY()+1);
        if(map.isVaildPosition(tempPosition)){
            player.setPosition(tempPosition);
            return true;
        }
        return false;
    }
    /**
     * @description: 玩家向东移动多步
     */
    public void moveEastMoreStep(Player player, Map map){
        System.out.println("请问向东移动几步？");
        int stepNumber = getIntFromScanner();
        for(int i =0; i<stepNumber; i++)
            if(!moveEastOneStep(player, map)){
                return;
            }
        showPosition(player);
    }
    /**
     * @description: 查看人物状态，即人物详细信息
     */
    public void checkPlayerInformation(Player p){
        System.out.println("========================");
        System.out.println("姓名：\t"+p.getName());
        System.out.println("职业：\t"+p.getProfession());
        System.out.println("等级：\t"+p.getLevel());
        System.out.println("状态：\t"+p.getState());
        System.out.println("金币：\t"+p.getMoney());
        System.out.println("========================");
    }



}
