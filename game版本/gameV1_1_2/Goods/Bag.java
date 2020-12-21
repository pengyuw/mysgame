package cn.yyj.game.Goods;

import java.util.LinkedList;

public class Bag {
    int size;
    int used;
    LinkedList<Goods> goods;

    public Bag(){
        this.size = 20;
        this.used = 0;
        goods = new LinkedList<Goods>();
    }
    /**
     * @description: 背包有放入和取出的操作
     */
    public void putIn(Goods goods){
        if(this.used == this.size){
            System.out.println("背包已满，不能装入！");
            return;
        }
        this.goods.add(goods);
        this.used++;
    }

    /**
     * @description: 背包取出分为两种情况：使用和丢弃
     */
    public Goods putOut(String name){
        for(Goods g : this.goods){
            if(name.equals(g.getName())){
                this.goods.remove(g);
                this.used--;
                return g;
            }
        }
        System.out.println("未发现该物品");
        return null;
    }

    /**
     * @description: 背包大小查看和扩充
     */

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public LinkedList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(LinkedList<Goods> goods) {
        this.goods = goods;
    }
}
