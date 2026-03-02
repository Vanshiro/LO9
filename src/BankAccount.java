public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdrawal) throws NegativeBalanceException {
        if (withdrawal > balance) {
            throw new NegativeBalanceException(balance - withdrawal);
        }
        else {
            this.balance -= withdrawal;
        }
    }

    public void quickWithdraw(double withdrawal) throws NegativeBalanceException {
        if (withdrawal > balance) {
            throw new NegativeBalanceException();
        }
        else {
            this.balance -= withdrawal;
        }
    }


}
