package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String s) {
        System.out.println("메일을 발송합니다: " + s);
        System.out.println("페메를 발송합니다: " + s);
    }
}
