package People;

public class Dealer extends Person{

    private int carsSold;

    public Dealer(String name, int age) {
        super(name, age);
        this.carsSold = 0;
    }

    public int getCarsSold() {
        return this.carsSold;
    }

    public void sellCar(){
        this.carsSold++;
    }
}
