package cn.yyj.game.common;

import cn.yyj.game.Map.Map;
import cn.yyj.game.Map.MapOperator;
import cn.yyj.game.Player.PlayOperator;
import cn.yyj.game.Player.Player;
import cn.yyj.game.Player.PlayerFactory;

import java.util.Scanner;

public class Game {
    static PlayerFactory playerFactory = new PlayerFactory();
    static PlayOperator playOperator = new PlayOperator();
    static MapOperator mapOperator = new MapOperator();
    static CommandsOperator commandsOperator = new CommandsOperator();

    /**
     * 游戏执行函数：由三个函数组成start()、gameGoing()、run()
     */
    public static void start(Player player, Map map){
        mapOperator.checkCurrentPositionForEvent(player.getPosition(), map);

        while(true){
            gameGoing(player, map);
        }
    }
    public static void gameGoing(Player player, Map map){
        Game.reporter("请选择命令：【向北】【向南】【向西】【向东】【调查】");
        Game.readCommand();             //读取命令
        Game.run(player, map);          //执行命令
    }
    public static void run(Player player, Map map){
        if(commandsOperator.getTempCommand().equals(Commands.GO_NORTH)){
            playOperator.moveNorthMoreStep(player, map);
            mapOperator.checkCurrentPositionForEvent(player.getPosition(), map);
            return;
        }
        if(commandsOperator.getTempCommand().equals(Commands.GO_EAST)){
            playOperator.moveEastMoreStep(player, map);
            mapOperator.checkCurrentPositionForEvent(player.getPosition(), map);
            return;
        }
        if(commandsOperator.getTempCommand().equals(Commands.GO_SOUTH)){
            playOperator.moveSouthMoreStep(player, map);
            mapOperator.checkCurrentPositionForEvent(player.getPosition(), map);
            return;
        }
        if(commandsOperator.getTempCommand().equals(Commands.GO_WEST)){
            playOperator.moveWestMoreStep(player, map);
            mapOperator.checkCurrentPositionForEvent(player.getPosition(), map);
            return;
        }
        if(commandsOperator.getTempCommand().equals(Commands.CHECK_STORE)){
            //check store
            return;
        }
        if(commandsOperator.getTempCommand().equals(Commands.CHECK_STATE)){
            playOperator.checkPlayerInformation(player);
            return;
        }
        if(commandsOperator.getTempCommand().equals(Commands.CHECK_INVESTIGATE)){
            mapOperator.checkCurrentPositionForEvent(player.getPosition(), map);
            return;
        }

    }
    /**
     * 游戏工具函数：如下
     */
    public static Player buildPlayer(){
        return playerFactory.createPlayerWithName();
    }
    public static void showPlayer(Player player){ playOperator.checkPlayerInformation(player); }
    public static Map buildMap() throws InterruptedException {
        return mapOperator.loadMap("地下监牢");//return mapOperator.loadMap("新手村"); //return mapOperator.loadMap("草原");
    }
    public static void readCommand(){
        System.out.print("命令:");
        while(!commandsOperator.acceptCommand(getStringFromScanner())){}
    }
    public static void reporter(String words){ System.out.println(words); }
    public static void reporterNoLn(String words){ System.out.print(words); };
    public static void reporterBlank(){ System.out.println();}
    public static int getIntFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    public static String getStringFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.next();
    }
}
