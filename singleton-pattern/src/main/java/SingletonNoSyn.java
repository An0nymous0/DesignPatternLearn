/**
 * Created by An0nymous on 16/8/17.
 */
public class SingletonNoSyn {
    private static SingletonNoSyn instance;
    private SingletonNoSyn(){}

    public static SingletonNoSyn getInstance() {
        if (instance == null) {
            instance = new SingletonNoSyn();
        }
        return instance;
    }
}
