package powerpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerFinderTest {
    @Test
    public void shouldReturnOneWhenOneRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(1, 1);
        int powerExpected = 1;
        assertEquals(powerExpected,actualPower);
    }

    @Test
    public void shouldReturnTwoWhenTwoRaisedToOne() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(2, 1);
        int powerExpected = 2;

        assertEquals(powerExpected,actualPower);
    }

    @Test
    public void shouldReturnFourWhenTwoRaisedTwo() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(2, 2);
        int powerExpected = 4;
        assertEquals(powerExpected,actualPower);
    }

    @Test
    public void shouldReturnNineWhenThreeRaisedToTwo() {
        PowerFinder powerFinder = new PowerFinder();
        int actualPower = powerFinder.getPowerOf(3,2);
        int powerExpected = 9;
        assertEquals(powerExpected,actualPower);
    }
}
