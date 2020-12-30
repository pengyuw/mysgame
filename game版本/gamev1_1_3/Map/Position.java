package cn.yyj.game.Map;

import cn.yyj.game.Event.Event;
import cn.yyj.game.Obstacle.Obstacle;

public class Position {
    int x;  // x代表横轴，东西
    int y;  // y代表纵轴，南北
    int z;  // z代表数轴，上下
    Event event;
    Obstacle obstacle;

    public Position(){}

    public Position(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Position(int x, int y, int z, Event event, Obstacle obstacle) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.event = event;
        this.obstacle = obstacle;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "【"+this.x+", "+this.y+", "+this.z+"】";
    }

    @Override
    public boolean equals(Object obj) {
        if(((Position)obj).getX()==this.x && this.y==((Position)obj).getY() && this.z==((Position)obj).getZ())
            return true;
        return false;
    }

}
