package karlpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void addTest() {
        MathUtils mathUtils = new MathUtils();
        int expected = 10;
        int actual = mathUtils.add(5,5);
        assertEquals(expected, actual, "add Method should sum 10");
    }
    @Test
    void areaOfCircleTest(){
        MathUtils mathUtils = new MathUtils();
        double  expected =  314.1592653589793;
        double actual = mathUtils.areaOfCircle(10);
        assertEquals(expected, actual);
    }
}
