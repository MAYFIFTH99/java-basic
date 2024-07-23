package objectoriented;

public class Account {
    int balance;
//    int deposit;
//    int withdraw;

    public Account(int balance) {
        this.balance = balance;
    }
    int getDeposit(int deposit) {
        balance += deposit;
        return balance;
    }
    int getWithdraw(int withdraw) {
        if (balance-withdraw < 0) {
            System.out.println("잔액 부족");
            return balance;
        } else {
            balance -= withdraw;
            return balance;
        }
    }

    void printBalance(Account account) {
        System.out.println(account.balance);
    }
}
