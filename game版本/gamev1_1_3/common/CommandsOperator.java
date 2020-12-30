package cn.yyj.game.common;

public class CommandsOperator {

    private Commands commands;
    private String tempCommand;

    public CommandsOperator(){
        this.commands = new Commands();
    }

    public boolean acceptCommand(String command){
        if(this.commands.getCommandsList().contains(command)){
            this.tempCommand = command;
            return true;
        }
        System.out.println("[root@GameWorld]:# 请重新输入正确的命令！");
        System.out.print("[root@GameWorld]:# 命令：");
        return false;
    }

    public String getTempCommand() {
        return tempCommand;
    }

    public void setTempCommand(String tempCommand) {
        this.tempCommand = tempCommand;
    }
}
