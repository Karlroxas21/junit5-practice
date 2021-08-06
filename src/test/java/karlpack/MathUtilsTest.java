package karlpack;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
    MathUtils mathUtils;
    TestReporter testReporter;
    TestInfo testInfo;

    @BeforeEach
    void mathUtils(TestReporter testReporter, TestInfo testInfo) {
        mathUtils = new MathUtils();
        this.testReporter = testReporter;
        this.testInfo = testInfo;
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + "with tags" + testInfo.getTags()); // print timestamps and information

    }


    @Test
    @DisplayName("add test") //display name in test
//    @Disabled //disable the test
    void addTest() {
        int expected = 10;
        int actual = mathUtils.add(5, 5);
        assertEquals(expected, actual, "add Method should sum 10");
    }

    @Test
    @Tag("Me")
    @DisplayName("area of circle")
    void areaOfCircleTest() {
        double expected = 314.1592653589793;
        double actual = mathUtils.areaOfCircle(10);
        assertEquals(expected, actual);
    }

    @Test
//    @EnabledOnJre(JRE.JAVA_8) // enable on specific JRE only.
    //@EnabledOnOs(OS.WINDOWS)
        // enable on specific OS.
    @DisplayName("Divide Test")
    void divideTest() {
//        assumeTrue(true); // if true, the test runs, vice versa if true.
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "If 0, Should throw");
    }
    @Nested
    @DisplayName("Nested")
    @Tag("Me")
    class nestMeTest {

        @Test
//        @DisplayName("add test") //display name in test
//        @Disabled //disable the test
        void addTest() {
            int expected = 10;
            int actual = mathUtils.add(5,5);

            assertEquals(expected, actual, () ->"add Method should sum " + expected); /*use lambda expression if
            the string is expensive to produce
            */
        }
        @Test
        void areaOfCircleTest(){
            double  expected =  314.1592653589793;
            double actual = mathUtils.areaOfCircle(10);
            assertEquals(expected, actual);
        }
    }

    @DisplayName("assert all")
    @RepeatedTest(3) // repeat n test
    void testMultiply(RepetitionInfo repeat){
        assertAll(
                // [() ->]is lambda
                () -> assertEquals(4, mathUtils.multiply(2,2)),
                () -> assertEquals(10, mathUtils.multiply(5,2)),
                () -> assertEquals(25, mathUtils.multiply(5,5)),
                () -> assertEquals(100, mathUtils.multiply(10,10))
        );

    }
}





