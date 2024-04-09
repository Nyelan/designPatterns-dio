package dio.projectTypes;

/**
 * Singleton Lazy Java Puro
 *
 * @author Nyelan
 */

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
