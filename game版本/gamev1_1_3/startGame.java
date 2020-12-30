package cn.yyj.game;

import cn.yyj.game.Map.Map;
import cn.yyj.game.Map.MapOperator;
import cn.yyj.game.Player.PlayOperator;
import cn.yyj.game.Player.Player;
import cn.yyj.game.Player.PlayerFactory;
import cn.yyj.game.common.Game;

import java.util.Scanner;

public class startGame {

    static Player player;
    static Map CurrentMap;

    public static void main(String args[]) throws InterruptedException {
        Game.reporter("[root@GameWorld]:# 正在进入游戏...");
        player = Game.buildPlayer();   //创建角色
        //Game.showPlayer(player);    //显示创建好的角色信息
        Thread.currentThread().sleep(2500);
        Game.reporter("[root@GameWorld]:# 正在载入地图...");
        Thread.currentThread().sleep(2500);
        Game.reporter("[root@GameWorld]:# 是否进入新地图？【是】");
        Game.reporterNoLn("命令：");
        while(!Game.getStringFromScanner().equals("是")){
            Game.reporter("[root@GameWorld]:# 请重新输入！");
        }
        CurrentMap = Game.buildMap();
        Game.start(player, CurrentMap);
    }
}
//21624
//2650