package cn.yyj.game.Goods.Equipment;

public class WornHelmet extends Equipment{

    int defend;

    public WornHelmet(){
        this.defend = 5;
        this.setLevel(1);
        this.setName("破头盔");
        this.setPrice(5);
    }

    @Override
    public int getDefend() {
        return this.defend;
    }
}
