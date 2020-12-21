package cn.yyj.game.Goods;

public class Goods {
    int price;
    int level;
    String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPrice(){
        return this.price;
    }
    public int getLevel(){
        return this.level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
