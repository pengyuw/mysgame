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

    public static void reporter(String words){
        System.out.println(words);
    }
    public static Player buildPlayer(){
        return playerFactory.createPlayerWithName();
    }
    public static void showPlayer(Player player){
        playOperator.checkPlayerInformation(player);    //查看角色基本信息
    }
    public static Map buildMap(){
        return mapOperator.loadMap("新手村");
    }

    /**
     * @description: 游戏开始，每次循环，人物一次操作
     */
    public static void start(Player player, Map map){
        //开始游戏操作,每循环一次，表示操作一次
        while(true){
            gameGoing(player, map);
        }
    }

    /**
     * @description: 每次操作的具体过程
     */
    public static void gameGoing(Player player, Map map){
        Game.reporter("========请选择【向北】【向东】【商店】【状态】========");
        Game.readCommand();
        Game.run(player, map);
    }
    public static int getIntFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    public static String getStringFromScanner(){
        Scanner s = new Scanner(System.in);
        return s.next();
    }
    public static void readCommand(){
        while(!commandsOperator.acceptCommand(getStringFromScanner())){}
    }
    public static void run(Player player, Map map){
        if(commandsOperator.getTempCommand().equals(Commands.GO_NORTH)){
            playOperator.moveNorthMoreStep(player, map);
        }
        if(commandsOperator.getTempCommand().equals(Commands.GO_EAST)){
            playOperator.moveEastMoreStep(player, map);
        }
        if(commandsOperator.getTempCommand().equals(Commands.CHECK_STORE)){

        }
        if(commandsOperator.getTempCommand().equals(Commands.CHECK_STATE)){
            playOperator.checkPlayerInformation(player);
        }

    }
}
