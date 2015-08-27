package factory.simple;

/**
 * Created by An0nymous on 15/8/27.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
