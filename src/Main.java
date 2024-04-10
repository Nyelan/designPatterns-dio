import dio.projectTypes.strategy.*;

public class Main {
    public static void main(String[] args) {

        /* SINGLETON

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        *  */

        // STRATEGY
        BotAction normal = new BotActionNormal();
        BotAction defensive = new BotActionDefensive();
        BotAction aggressive = new BotActionAggressive();

        Bot bot = new Bot();
        bot.setAction(normal);
        bot.move();

        bot.setAction(aggressive);
        bot.move();

        bot.setAction(defensive);
        bot.move();

    }
}