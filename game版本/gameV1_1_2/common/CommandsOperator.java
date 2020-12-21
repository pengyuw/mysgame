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
        return false;
    }

    public String getTempCommand() {
        return tempCommand;
    }

    public void setTempCommand(String tempCommand) {
        this.tempCommand = tempCommand;
    }
}
