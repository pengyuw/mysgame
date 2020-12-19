package map;

public class fallMap implements Map{
    // 共同特点接口
    @Override
    public void description() {

    }


    public void fallMap(){

        System.out.println("在你面前的是一片草原 你可以 1.狩猎 2.割草 3.进入城市地区打劫/普通生活");

    }

    public void hunting(){
        /**************描述****************/
        System.out.println("欢迎来到草原猎场 在这里你可以狩猎到兔子 兔子可以填饱你的胃或卖了赚钱");
        System.out.println("注意 小概率下可能会碰到狼 如果没有猎枪可能会game over");

        /**************逻辑****************/
        double random = Math.random();

    }


}
