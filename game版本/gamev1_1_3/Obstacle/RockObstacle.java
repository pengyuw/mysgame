package cn.yyj.game.Obstacle;

public class RockObstacle extends Obstacle{
    private String name;

    public RockObstacle(){
        this.name = "面前是一面石墙，无法前进";
        this.setVisible(true);
    }
    public RockObstacle(String name){
        this.name = name;
        this.setVisible(true);
    }
}
