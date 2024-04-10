package dio.projectTypes.strategy;

public class Bot {

    private BotAction action;

    public void setAction(BotAction action) {
        this.action = action;
    }

    public void move(){
        action.move();
    }


}
