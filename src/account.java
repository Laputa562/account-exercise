public class account {
    private double balance = 0.0;
    public static int incrementID = 0;
    private int ID = 0;
    public double setBalance(double balance) {
        if(balance < 0.0) {
            return this.balance;
        }else  {
            return balance;
        }
    }
    public account(double balance) {
        this.balance = setBalance(balance);
        this.ID = incrementID++;
    }
    public double getBalance(){
        return this.balance;
    }

    public double getID(){
        return ID;
    }

    public void setDeposit(double deposit){
        if(deposit < 0) {
            System.out.println("Deposit cannot be negative");
        }else{
            this.balance += deposit;}
    }
    public void setDebit(double debit) {
        if (debit < 0) {
            System.out.println("Debit cannot be negative");
        } else if (debit > this.balance) {
            System.out.println("Debit cannot be greater than balance!!");
        } else {
            this.balance -= debit;
        }
    }
    public void displayAccount(){
        System.out.println("ID: " + getID());
        System.out.println("Balance: " + getBalance());
    }

}
