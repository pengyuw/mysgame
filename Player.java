import java.util.Scanner;

public class Player {
    String name,skills;
    int blood,money,energy,attack;

    public Player(){
        blood = 100;
        money = 50;
        energy = 100;
        attack = 5;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void addAttack(int addValue){
        this.attack = this.attack + addValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void addBlood(int Blood) {
        this.blood = this.blood + Blood;
    }

    public void subtractBlood(int Blood){
        this.blood -= Blood;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void subtractMoney(int subtractMoney){
        this.money = this.money - subtractMoney;
    }

    public void addMoney(int addMoney){
        this.money = this.money + addMoney;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}

