/**
 * Created by An0nymous on 16/8/17.
 */
public class SingletonSyn {
    private static SingletonSyn instance;
    private SingletonSyn (){}

    public static synchronized SingletonSyn getInstance() {
        if (instance == null) {
            instance = new SingletonSyn();
        }
        return instance;
    }
}
