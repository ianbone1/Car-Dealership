import Car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private Wheel lhf;
    private Wheel lhr;
    private Wheel rhf;
    private Wheel rhr;
    private Car car;

    @Before
    public void setup(){
        engine = new Engine(190, Transmission.AUTOMATIC, Fuel.DEISEL);
        lhf = new Wheel(18);
        rhf = new Wheel(18);
        lhr = new Wheel(18);
        rhr = new Wheel(18);
        car = new Car("Red", 30000.0);
    }

    @Test
    public void hasColour() {
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(30000.0, car.getPrice(),0.0);
    }

    @Test
    public void canAddComponents() {
        car.addComponent(engine);
        car.addComponent(lhf);
        car.addComponent(lhr);
        car.addComponent(rhf);
        car.addComponent(rhr);
        assertEquals(5, car.componentCount());
    }
}
