import org.junit.Test;
import powerpackage.PowerFinder;

import static org.junit.Assert.assertEquals;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assertEquals(1, PowerFinder.powerOf(1,1));
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assertEquals(2, PowerFinder.powerOf(2,1));
    }

    @Test
    public void twoPowerTwoIsFour() {
        assertEquals(4, PowerFinder.powerOf(2, 2));
    }

    @Test
    public void powerOfTwoAndThreeIsSix() {
        assertEquals(9, PowerFinder.powerOf(3, 2));
    }
}
