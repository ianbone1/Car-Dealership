import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomerTest {

    private Customer cust1;

    @Before
    public void setup(){
        cust1=new Customer("Ian",47, 30000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ian", cust1.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(30000.0, cust1.getWallet(),0.0);
    }

    @Test
    public void hasAge() {
        assertEquals(47, cust1.getAge());
    }

    @Test
    public void addMoney() {
        cust1.addMoney(10.0);
        assertEquals(30010.0, cust1.getWallet(),0.0);
    }

    @Test
    public void payBill() {
        assertTrue(cust1.pay(10000.0));
        assertEquals(20000.0, cust1.getWallet(),0.0);
    }
}
