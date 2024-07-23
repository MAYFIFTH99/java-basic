package poly.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = new Sender[]{
                new EmailSender(),
                new SmsSender(),
                new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다");
        }

    }
}
