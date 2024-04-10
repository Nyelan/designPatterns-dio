package dio.projectTypes.singleton;

/**
 * Singleton Eager Java Puro
 *
 * @author Nyelan
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }

}
