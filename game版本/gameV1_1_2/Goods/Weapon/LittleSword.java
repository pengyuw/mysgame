package cn.yyj.game.Goods.Weapon;

public class LittleSword extends Weapon {

    int attack;

    public LittleSword(){
        this.setLevel(1);
        this.setPrice(10);
        this.setName("小刀");
        this.attack = 10;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }


}
