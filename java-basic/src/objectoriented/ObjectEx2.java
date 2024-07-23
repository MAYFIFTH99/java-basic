package objectoriented;

public class ObjectEx2 {
    public static void main(String[] args) {
        Account account = new Account(0);
        int balance = 0;
        balance = account.getDeposit(1000);
        balance = account.getWithdraw(2000);
        account.printBalance(account);

    }
}
