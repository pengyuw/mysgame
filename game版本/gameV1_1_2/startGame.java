package cn.yyj.game;

import cn.yyj.game.Map.Map;
import cn.yyj.game.Player.Player;
import cn.yyj.game.common.Game;

public class startGame {

    static Player player;
    static Map CurrentMap;

    public static void main(String args[]){
        Game.reporter("正在进入游戏...");
        player = Game.buildPlayer();   //创建角色
        Game.showPlayer(player);    //显示创建好的角色信息

        Game.reporter("正在载入地图...");
        CurrentMap = Game.buildMap();
        Game.reporter("当前位置："+player.getPosition().toString());

        Game.start(player, CurrentMap);
    }
}
