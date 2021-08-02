package karlpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    MathUtils mathUtils;

    @BeforeEach
    void  mathUtils(){
        mathUtils = new MathUtils();
    }

    
    @Test
    void addTest() {
        int expected = 10;
        int actual = mathUtils.add(5,5);
        assertEquals(expected, actual, "add Method should sum 10");
    }
    @Test
    void areaOfCircleTest(){
        double  expected =  314.1592653589793;
        double actual = mathUtils.areaOfCircle(10);
        assertEquals(expected, actual);
    }
    @Test
    void divideTest(){
        assertThrows(ArithmeticException.class, () ->mathUtils.divide(1, 0),"If 0, Should throw");


    }
}
