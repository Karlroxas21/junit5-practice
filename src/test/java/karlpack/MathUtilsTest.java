package karlpack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void name() {
        MathUtils mathUtils = new MathUtils();
        int expected = 90;
        int actual = mathUtils.add(5,5);
        assertEquals(expected, actual, "add Method should sum 10");
    }
    @Test
    void test2(){
        fail();
    }
}
