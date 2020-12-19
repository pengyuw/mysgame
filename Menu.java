import map.*;
import java.util.Scanner;


public class Menu {

    springMap springmap = new springMap();
    winterMap wintermap = new winterMap();
    fallMap fallmap = new fallMap();
    summerMap summermap = new summerMap();
    Store store = new Store();
    Player player1;

    public void mainMenu() {

        System.out.println("1:探索地图  2:商店  3：吃药  4.查看状态");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        // 探索地图
        if (a == 1) {
            System.out.println("请选择你要进入的关卡  1：春天地图  2：秋天地图  3：夏天地图  4：冬天地图  5:返回主菜单");
            Scanner Input = new Scanner(System.in);
            int aa = Input.nextInt();
            if (aa == 1) {
                springMap springmap;
            }
            else if (aa == 2) {
                fallMap fallmap;
            }
            else if (aa == 3) {
                if(store.swimmingTool = true) {
                    summerMap summermap;
                } else {
                    System.out.println("尚未购买雪橇无法进入该地图 返回主菜单");
                    mainMenu();
                }
            }
            else if (aa == 4){
                if(store.sled = true) {
                    summerMap summermap;
                } else {
                    System.out.println("尚未购买雪橇无法进入该地图 返回主菜单");
                    mainMenu();
                }
                winterMap wintermap;
            }
            else {
                System.out.println("返回主菜单或输入错误");
                mainMenu();
            }
        }

        // 商店
        else if (a == 2) {
            System.out.println("请选择你要购买的商品：1.斧头 2.猎枪 3.潜水套装（用于进入夏天地图） " +
                    "4.雪橇（用于进入冬天地图）  5.绷带  6.急救包  7.返回主菜单");
            Scanner Input = new Scanner(System.in);
            int b = Input.nextInt();
            if(b == 1){
                store.buyAxe();
            } else if (b == 2) {
                store.buyGun();
            } else if (b == 3) {
                store.buySwimmingTool();
            } else if (b == 4) {
                store.buySled();
            } else if (b == 5) {
                store.buyBandage();
            } else if (b == 6) {
                store.buyMedicineBag();
            }
            mainMenu();

        }

        // 吃药
        else if (a == 3){
            System.out.println("请选择你要用的药  1.绷带  2.急救包  3.返回主菜单");
            Scanner Input = new Scanner(System.in);
            int b = Input.nextInt();
            if (b == 1) {
                store.useBandage();
            } else if (b == 2) {
                store.useMedicineBag();
            }
            mainMenu();
        }

        // 查看玩家状态
        else if (a == 4) {
            System.out.println("当前金币为：" + player1.getMoney());
            System.out.println("绷带剩余：" + store.getBandage());
            System.out.println("急救包剩余：" + store.getMedicineBag());
            System.out.println("目前攻击力：" + player1.getAttack());
            System.out.println("血量：" + player1.getBlood());
            mainMenu();
            //如何查看我有没有枪？？
        }

        // 输入错误 返回主菜单
        else {
            System.out.println("输入错误：请输入1/2/3/4");
            mainMenu();
        }
    }
}
