package cn.yyj.game.Event;

public class Event {
    String shortDescription;
    int eventType;
    boolean eventSwitch;

    public Event() {
        this.eventSwitch = false;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public boolean getEventSwitch() {
        return eventSwitch;
    }

    public void setEventSwitch(boolean eventSwitch) {
        this.eventSwitch = eventSwitch;
    }
}
