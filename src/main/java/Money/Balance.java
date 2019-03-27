package Money;

public abstract class Balance {

    private double balance;

    public Balance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addMoney(double cash){
        this.balance+=cash;
    }

    public boolean withdrawMoney(double cash){
        if (this.balance >= cash){
            this.balance-=cash;
            return true;
        }
        return false;
    }
}
