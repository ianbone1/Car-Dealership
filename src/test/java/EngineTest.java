import Car.Engine;
import Car.Fuel;
import Car.Transmission;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void setup(){
        engine = new Engine(190, Transmission.AUTOMATIC, Fuel.DEISEL);
    }

    @Test
    public void hasFuelTransmission() {
        assertEquals(Transmission.AUTOMATIC, engine.getType());
    }

    @Test
    public void hasFuelType() {
        assertEquals(Fuel.DEISEL, engine.getFuel());
    }

    @Test
    public void hasBHP() {
        assertEquals(190, engine.getBhp());
    }
}
