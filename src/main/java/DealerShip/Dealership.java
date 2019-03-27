package DealerShip;

import Car.Car;
import Money.Till;
import People.Customer;
import People.Dealer;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carStock;
    private ArrayList<Dealer> dealers;
    private Till till;
    private String dealershipName;

    public Dealership(String dealershipName) {
        this.carStock = new ArrayList<Car>();
        this.dealers = new ArrayList<Dealer>();
        this.till = new Till(0.0);
        this.dealershipName = dealershipName;
    }

    public int hasCarStock() {
        return this.carStock.size();
    }

    public int hasDealers() {
        return this.dealers.size();
    }

    public double getTillBalance() {
        return this.till.getBalance();
    }

    public String getDealershipName() {
        return this.dealershipName;
    }

    public void addCar(Car car){
        this.carStock.add(car);
    }

    public ArrayList<Car> getAllStock(){
        return carStock;
    }

    public void addDealer(Dealer dealer){
        dealers.add(dealer);
    }

    public boolean carIsInStock(Car car){
        return this.carStock.contains(car);
    }

    public void sellCar(Car car, Dealer dealer, Customer customer) {
        if (this.carIsInStock(car)){
            if (customer.pay(car.getPrice())){
                this.till.addMoney(car.getPrice());
                dealer.sellCar();
                this.carStock.remove(car);
            }
        }
    }

    public void buyCar(Car car){
        if (this.till.withdrawMoney(car.getPrice())){
                this.carStock.add(car);
        }
    }


    public void repairCar(Car car) {
        if (this.till.withdrawMoney(car.getDamage())){
            car.repairDamage();
        }
    }
}
