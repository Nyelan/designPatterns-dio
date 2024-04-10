package dio.projectTypes.strategy;

public class BotActionAggressive implements BotAction{

    @Override
    public void move() {
        System.out.println("Moving aggressively ...");
    }
}
