package cn.yyj.game.Event;

public class IllustrationEvent extends Event{
    String description;

    public IllustrationEvent(String description){
        this.description = description;
        this.eventSwitch = true;
        this.eventType = 1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
