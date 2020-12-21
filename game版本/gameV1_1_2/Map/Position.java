package cn.yyj.game.Map;

public class Position {
    int x;
    int y;
    int z;
    public Position(){}
    public Position(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
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
