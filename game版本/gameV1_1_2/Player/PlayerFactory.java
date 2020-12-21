package cn.yyj.game.Player;

import java.util.Scanner;

public class PlayerFactory {
    /**
     * @description: 为创建的角色命名，并创建
     */
    public Player createPlayerWithName(){
        System.out.println("请为您的角色起一个名字：");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        if(name.equals("") || name==null){
            System.out.println("输入错误，请重新输入");
            createPlayerWithName();
        }
        return initPlayerWithName(name);
    }
    private Player initPlayerWithName(String name){
        return new Player(name);
    }

    /**
     * @description: 使用职业创建角色，已废弃
     */
    public Player createPlayerWithProfession(){
        System.out.println("请选择一种职业：【勇士】【法师】");
        Scanner s = new Scanner(System.in);
        String profession = s.next();
        if(profession.equals("勇士")){
            return initPlayerAsAWarrior();
        }else if(profession.equals("法师")){
            return initPlayerAsAWizard();
        }else{
            System.out.println("您选择了默认职业：法师");
            return initPlayerAsAWarrior();
        }
    }
    private Player initPlayerAsAWarrior(){
        return new Player("勇士");
    }
    private Player initPlayerAsAWizard(){
        return new Player("法师");
    }





}
