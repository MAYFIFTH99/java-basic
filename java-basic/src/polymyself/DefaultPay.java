package polymyself;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단 없음");
        return false;
    }
}
