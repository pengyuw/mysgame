package cn.yyj.game.Player;

import cn.yyj.game.Map.Position;
import cn.yyj.game.Goods.Weapon.Weapon;

public class Player {
    /******************基础属性********************************/
    String name;

    /******************基础属性：外部***************************/
    int money;                  //金币
    Position position;          //位置坐标
    String profession;          //职业
    int level;                  //等级
    int professionLevel;        //职业等级

    /******************基础属性：自身***************************/
    int blood;                  //血量
    int attack;                 //攻击力
    int defend;                 //防御力
    String state;               //健康状态
    boolean isPoisoned;         //中毒
    boolean isConfused;         //混乱
    boolean isLimited;          //受限


    /******************特殊属性：变量***************************/
    int killDeath;      //消灭敌人数
    int rounds;         //起死回生次数
    int callForHelp;    //请救兵次数
    int prestige;       //威望（对外）：对妖精的威望，1. 杀死妖怪 2. 杀死仙人 3. 获得称号
    int evil;           //邪恶值（对内）：做坏事次数
    int tasksAchieved;  //任务完成数

    /******************装备**********************************/
    Weapon head;
    Weapon leftHand;
    Weapon rightHand;
    Weapon body;
    Weapon pants;
    Weapon shoes;
    Weapon magicWeapen;

    /******************各种职业：初始化玩家********************/
    /**
     * @description: 名字初始化构造函数
     */
    public Player(String name){
        this.name = name;
        this.money = 10;
        this.position = new Position(0,0,0);
        this.level = 1;
        this.profession = "无职业";
        this.professionLevel = 1;

        this.killDeath = 0;
        this.rounds = 0;
        this.callForHelp = 0;
        this.prestige = 0;
        this.evil = 0;
        this.tasksAchieved = 0;

        this.attack = 5;
        this.blood = 15;
        this.defend = 5;
        this.state = "健康";
        this.isPoisoned = false;
        this.isConfused = false;
        this.isLimited = false;

        System.out.println("[root@GameWorld]:# 游戏角色创建完成！！！");

    }

    /**
     * @descrption: 职业初始化构造函数，已废弃
     */
    public Player(String name, String profession){
        this.name = "无名小卒";
        this.money = 10;
        this.position = new Position(0,0,0);
        this.level = 1;
        this.profession = profession;
        this.professionLevel = 1;

        this.killDeath = 0;
        this.rounds = 0;
        this.callForHelp = 0;
        this.prestige = 0;
        this.evil = 0;
        this.tasksAchieved = 0;

        if(profession.equals("勇士")){
            this.attack = 5;
            this.blood = 15;
            this.defend = 5;
            this.state = "健康";
            this.isPoisoned = false;
            this.isConfused = false;
            this.isLimited = false;
        }
        if(profession.equals("法师")){
            this.attack = 2;
            this.blood = 12;
            this.defend = 2;
            this.state = "健康";
            this.isPoisoned = false;
            this.isConfused = false;
            this.isLimited = false;
        }
    }


    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getProfession() {
        return profession;
    }

    public int getProfessionLevel() {
        return professionLevel;
    }

    public void setProfessionLevel(int professionLevel) {
        this.professionLevel = professionLevel;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(boolean poisoned) {
        isPoisoned = poisoned;
    }

    public boolean isConfused() {
        return isConfused;
    }

    public void setConfused(boolean confused) {
        isConfused = confused;
    }

    public boolean isLimited() {
        return isLimited;
    }

    public void setLimited(boolean limited) {
        isLimited = limited;
    }

    public int getKillDeath() {
        return killDeath;
    }

    public void setKillDeath(int killDeath) {
        this.killDeath = killDeath;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getCallForHelp() {
        return callForHelp;
    }

    public void setCallForHelp(int callForHelp) {
        this.callForHelp = callForHelp;
    }

    public int getPrestige() {
        return prestige;
    }

    public void setPrestige(int prestige) {
        this.prestige = prestige;
    }

    public int getEvil() {
        return evil;
    }

    public void setEvil(int evil) {
        this.evil = evil;
    }

    public int getTasksAchieved() {
        return tasksAchieved;
    }

    public void setTasksAchieved(int tasksAchieved) {
        this.tasksAchieved = tasksAchieved;
    }

    public Weapon getHead() {
        return head;
    }

    public void setHead(Weapon head) {
        this.head = head;
    }

    public Weapon getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Weapon leftHand) {
        this.leftHand = leftHand;
    }

    public Weapon getRightHand() {
        return rightHand;
    }

    public void setRightHand(Weapon rightHand) {
        this.rightHand = rightHand;
    }

    public Weapon getBody() {
        return body;
    }

    public void setBody(Weapon body) {
        this.body = body;
    }

    public Weapon getPants() {
        return pants;
    }

    public void setPants(Weapon pants) {
        this.pants = pants;
    }

    public Weapon getShoes() {
        return shoes;
    }

    public void setShoes(Weapon shoes) {
        this.shoes = shoes;
    }

    public Weapon getMagicWeapen() {
        return magicWeapen;
    }

    public void setMagicWeapen(Weapon magicWeapen) {
        this.magicWeapen = magicWeapen;
    }
}
