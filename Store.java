import java.util.Scanner;

public class Store {
    // 未写饮料 + 鞋
    Menu menu = new Menu();
    Player player1 = new Player();
    boolean axe, gun, shoes, swimmingTool, sled = false; //斧头 枪 鞋 潜水道具 雪橇
    int bandage, medicineBag, drinks = 0; //绷带 急救包 饮料

    public int getBandage() {
        return bandage;
    }

    public void setBandage(int bandage) {
        this.bandage = bandage;
    }

    public int getMedicineBag() {
        return medicineBag;
    }

    public void setMedicineBag(int medicineBag) {
        this.medicineBag = medicineBag;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public boolean isAxe() {
        return axe;
    }

    public void setAxe(boolean axe) {
        this.axe = axe;
    }

    public boolean isGun() {
        return gun;
    }

    public void setGun(boolean gun) {
        this.gun = gun;
    }

    public boolean isShoes() {
        return shoes;
    }

    public void setShoes(boolean shoes) {
        this.shoes = shoes;
    }

    public boolean isSwimmingTool() {
        return swimmingTool;
    }

    public void setSwimmingTool(boolean swimmingTool) {
        this.swimmingTool = swimmingTool;
    }

    public boolean isSled() {
        return sled;
    }

    public void setSled(boolean sled) {
        this.sled = sled;
    }

    public void buyAxe() {
        /**************描述****************/
        System.out.println("商品：斧头, 它可以帮你更快速的割草伐木,碰到猎物时也可以成为得力的武器");
        System.out.println("售价：20金币 购买后获得普通攻击+5");
        System.out.println("注意：每使用一次斧头你的体力值将会-10");
        System.out.println("确定购买斧头吗? y/n");

        /**************逻辑****************/
        Scanner input = new Scanner(System.in);
        String buy = input.next();
        if (buy == "n" || player1.getMoney() < 20) {
            System.out.println("已取消购买或金币不足 将返回主菜单");
            menu.mainMenu();
        }
        player1.addAttack(5);
        player1.subtractMoney(20);
        this.axe = true;
        System.out.println("恭喜您购买成功！");
        menu.mainMenu();
    }

    public void buyGun() {
        /**************描述****************/
        System.out.println("商品：猎枪, 虽然无法伐木割草 但是它会猎物造成更大程度伤害");
        System.out.println("售价：50金币 购买后获得普通攻击+30");
        System.out.println("注意：每使用一次猎枪你的体力值将会-5");
        System.out.println("确定购买猎枪吗? y/n");

        /**************逻辑****************/
        Scanner input = new Scanner(System.in);
        String buy = input.next();
        if (buy == "n" || player1.getMoney() < 50) {
            System.out.println("已取消购买或金币不足 将返回主菜单");
            menu.mainMenu();
        }
        player1.addAttack(30);
        player1.subtractMoney(50);
        this.gun = true;
        System.out.println("恭喜您购买成功！");
        menu.mainMenu();
    }

    public void buySwimmingTool() {
        /**************描述****************/
        System.out.println("商品：潜水套装, 有了它你将能够进入夏天关卡");
        System.out.println("售价：100金币");
        System.out.println("确定购买潜水套装吗? y/n");

        /**************逻辑****************/
        Scanner input = new Scanner(System.in);
        String buy = input.next();
        if (buy == "n" || player1.getMoney() < 100) {
            System.out.println("已取消购买或金币不足 将返回主菜单");
            menu.mainMenu();
        }
        player1.subtractMoney(100);
        this.swimmingTool = true;
        System.out.println("恭喜您购买成功");
        menu.mainMenu();
    }

    public void buySled() {
        /**************描述****************/
        System.out.println("商品：雪橇, 有了它你将能够进入冬天关卡");
        System.out.println("售价：200金币");
        System.out.println("确定购买雪橇吗? y/n");

        /**************逻辑****************/
        Scanner input = new Scanner(System.in);
        String buy = input.next();
        if (buy == "n" || player1.getMoney() < 200) {
            System.out.println("已取消购买或金币不足 将返回主菜单");
            menu.mainMenu();
        }
        player1.subtractMoney(200);
        this.sled = true;
        System.out.println("恭喜您购买成功");
        menu.mainMenu();
    }

    public void buyBandage() {
        /**************描述****************/
        System.out.println("商品：绷带， 它可以为你补充10点血量");
        System.out.println("售价：10金币");
        System.out.println("确定购买绷带吗? y/n");

        /**************逻辑****************/
        Scanner input = new Scanner(System.in);
        String buy = input.next();
        if (buy == "n" || player1.getMoney() < 10) {
            System.out.println("已取消购买或金币不足 将返回主菜单");
            menu.mainMenu();
        }
        System.out.println("请输入购买绷带数量");
        Scanner inputt = new Scanner(System.in);
        int buyy = inputt.nextInt();
        if (buyy * 10 <= player1.getMoney()) {
            this.bandage += buyy;
            player1.subtractMoney(buyy * 10);
            System.out.println("已购买" + buyy + "个绷带, 现有" + this.bandage + "个绷带");
            System.out.println("金币余额：" + player1.getMoney());
            menu.mainMenu();
        } else {
            System.out.println("金钱不足或输入错误");
            buyBandage();
        }
    }

    public void buyMedicineBag(){
        /**************描述****************/
        System.out.println("商品：急救包， 它可以为你补充50点血量");
        System.out.println("售价：30金币");
        System.out.println("确定购买急救包吗? y/n");

        /**************逻辑****************/
        Scanner input = new Scanner(System.in);
        String buy = input.next();
        if (buy == "n" || player1.getMoney() < 30) {
            System.out.println("已取消购买或金币不足 将返回主菜单");
            menu.mainMenu();
        }
        System.out.println("请输入购买急救包数量");
        Scanner inputt = new Scanner(System.in);
        int buyy = inputt.nextInt();
        if (buyy * 30 <= player1.getMoney()) {
            this.medicineBag += buyy;
            player1.subtractMoney(buyy * 30);
            System.out.println("已购买" + buyy + "个急救包, 现有" + bandage + "个急救包");
            System.out.println("金币余额：" + player1.getMoney());
            menu.mainMenu();
        } else {
            System.out.println("金钱不足或输入错误");
            buyMedicineBag();
        }
    }

    public void useMedicineBag(){
        System.out.println("请输入使用急救包的数量 (输入0返回主菜单)");
        Scanner input = new Scanner(System.in);
        int use = input.nextInt();
        if ( use == 0 || medicineBag < use) {
            System.out.println("已取消使用或个数不足 将返回主菜单");
            menu.mainMenu();
        }
        player1.addBlood(50 * use);
        System.out.println("使用成功！ 现有血量：" + player1.getBlood());
        System.out.println("急救包剩余：" + medicineBag);
        menu.mainMenu();
    }

    public void useBandage(){
        System.out.println("请输入使用绷带的数量 (输入0返回主菜单)");
        Scanner input = new Scanner(System.in);
        int use = input.nextInt();
        if ( use == 0 || bandage < use) {
            System.out.println("已取消使用或个数不足 将返回主菜单");
            menu.mainMenu();
        }
        player1.addBlood(10 * use);
        this.bandage -= use;
        System.out.println("使用成功！ 现有血量：" + player1.getBlood());
        System.out.println("绷带剩余：" + bandage);
        menu.mainMenu();
    }
}
