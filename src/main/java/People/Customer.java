package People;

import Money.Wallet;

public class Customer extends Person {

    private Wallet wallet;

    public Customer(String name, int age, double wallet) {
        super(name, age);
        this.wallet = new Wallet(wallet);
    }

    public double getWallet() {
        return this.wallet.getBalance();
    }

    public boolean pay(double bill){
        return wallet.withdrawMoney(bill);
    }

    public void addMoney(double cash){
        wallet.addMoney(cash);
    }
}
