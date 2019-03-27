import Car.Car;
import Car.Transmission;
import Car.Engine;
import Car.Wheel;
import Car.Fuel;
import DealerShip.Dealership;
import People.Customer;
import People.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DealershipTest {

    private Dealership dealership;
    private Engine engine1;
    private Wheel lhf1;
    private Wheel lhr1;
    private Wheel rhf1;
    private Wheel rhr1;
    private Car car1;
    private Engine engine2;
    private Wheel lhf2;
    private Wheel lhr2;
    private Wheel rhf2;
    private Wheel rhr2;
    private Car car2;
    private Dealer dealer1;
    private Dealer dealer2;
    private Customer customer;

    @Before
    public void setup(){
        engine1 = new Engine(190, Transmission.AUTOMATIC, Fuel.DEISEL);
        lhf1 = new Wheel(18);
        rhf1 = new Wheel(18);
        lhr1 = new Wheel(18);
        rhr1 = new Wheel(18);
        car1 = new Car("Red", 30000.0);
        car1.addComponent(engine1);
        car1.addComponent(lhf1);
        car1.addComponent(rhf1);
        car1.addComponent(lhr1);
        car1.addComponent(rhr1);
        engine2 = new Engine(190, Transmission.MANUAL, Fuel.PETROL);
        lhf2 = new Wheel(17);
        rhf2 = new Wheel(17);
        lhr2 = new Wheel(17);
        rhr2 = new Wheel(17);
        car2 = new Car("Blue", 25000.0);
        car2.addComponent(engine2);
        car2.addComponent(lhf2);
        car2.addComponent(rhf2);
        car2.addComponent(lhr2);
        car2.addComponent(rhr2);
        dealer1 = new Dealer("Sponge Bobe", 34);
        dealer2 = new Dealer("Patrick", 33);
        customer = new Customer("Ian", 47, 40000.0);
        dealership = new Dealership("Big Bobs Lemons");
        dealership.addCar(car1);
        dealership.addCar(car2);
        dealership.addDealer(dealer1);
        dealership.addDealer(dealer2);
    }

    @Test
    public void hasStock() {
        assertEquals(2, dealership.hasCarStock());
    }

    @Test
    public void hasDealers() {
        assertEquals(2, dealership.hasDealers());
    }

    @Test
    public void carInStock() {
        assertTrue(dealership.carIsInStock(car1));
    }

    @Test
    public void canSellCar() {
        dealership.sellCar(car1, dealer1, customer);
        assertEquals(1, dealership.hasCarStock());
        assertEquals(1, dealer1.getCarsSold());
        assertEquals(30000.0, dealership.getTillBalance(),0.0);
        assertEquals(10000.0, customer.getWallet(), 0.0);
    }

    @Test
    public void canBuyCar() {
        dealership.sellCar(car1, dealer1, customer);
        dealership.buyCar(car1);
        assertEquals(2, dealership.hasCarStock());
        assertEquals(1, dealer1.getCarsSold());
        assertEquals(0.0, dealership.getTillBalance(),0.0);
        assertEquals(10000.0, customer.getWallet(), 0.0);
    }

    @Test
    public void damageCar() {
        car1.addDamage(1000.0);
        assertEquals(29000.0,car1.getPrice(),0.0);
    }

    @Test
    public void repairCar() {
        dealership.sellCar(car1, dealer1, customer);
        car2.addDamage(1000.0);
        assertEquals(24000.0, car2.getPrice(),0.0);
        dealership.repairCar(car2);
        assertEquals(29000, dealership.getTillBalance(),0.0);
    }
}
