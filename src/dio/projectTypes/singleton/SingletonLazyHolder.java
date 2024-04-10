package dio.projectTypes.singleton;

/**
 * Singleton Eager Java Puro
 *
 * @author Nyelan
 */

public class SingletonLazyHolder {

    private static SingletonLazyHolder instance = new SingletonLazyHolder();

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstance(){
        return instance;
    }

}
