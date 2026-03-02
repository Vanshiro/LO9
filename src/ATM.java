public class ATM {
    private BankAccount acc;

    public ATM(){
        acc = new BankAccount(500.0);
    }

    public void handleTransaction(){
        try{
            acc.withdraw(600);
        }catch(NegativeBalanceException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        try{
            acc.quickWithdraw(600);
        }catch(NegativeBalanceException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ATM obj1 = new ATM();
        obj1.handleTransaction();
    }
}
