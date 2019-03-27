import People.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setup(){
        dealer= new Dealer("Dave", 32);
    }

    @Test
    public void soldNoCars() {
        assertEquals(0,dealer.getCarsSold());
    }

    @Test
    public void sellCar() {
        dealer.sellCar();
        assertEquals(1,dealer.getCarsSold());

    }
}
