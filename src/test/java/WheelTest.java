import Car.Wheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelTest {

    private Wheel lhf;

    @Before
    public void setup(){
        lhf = new Wheel(18);
    }

    @Test
    public void wheelHasSize() {
        assertEquals(18, lhf.getSize());
    }
}
