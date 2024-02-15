package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String s) {
        System.out.println("메일을 발송합니다: " + s);
        System.out.println("SMS을 발송합니다: " + s);
    }
}
