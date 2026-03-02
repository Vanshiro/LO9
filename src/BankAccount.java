public class BankAccount {
    private double balance;
    //Set balance
    public BankAccount(double balance) {
        this.balance = balance;
    }
    //Withdraw logic, make sure withdrawal doesnt exceed balance. Throw negativebalanceexception with param
    public void withdraw(double withdrawal) throws NegativeBalanceException {
        if (withdrawal > balance) {
            throw new NegativeBalanceException(balance - withdrawal);
        }
        else {
            this.balance -= withdrawal;
        }
    }
    //quickwithdraw logic, make sure withdrawal doesnt exceed balance. Throw negativebalanceexception without param
    public void quickWithdraw(double withdrawal) throws NegativeBalanceException {
        if (withdrawal > balance) {
            throw new NegativeBalanceException();
        }
        else {
            this.balance -= withdrawal;
        }
    }


}
