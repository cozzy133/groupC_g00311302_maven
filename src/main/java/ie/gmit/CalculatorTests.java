package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class CalculatorTests {

    private Calculator myCalculator;
    @BeforeAll
    @DisplayName("Starting tests")
    public static void print(){
        System.out.println("Starting tests");
    }

    @BeforeEach
    @DisplayName("New instance of counter")
    void init(TestInfo testInfo, TestReporter testReporter)
    {
        myCalculator = new Calculator();
        System.out.println("timestamp = " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Constructor test")
    void testConstructor(TestInfo testInfo)
    {
        assertEquals(0, myCalculator.getAnswer());
    }

    @Test
    @DisplayName("test Add")
    void testAdd(TestInfo testInfo)
    {
        assertEquals(20, myCalculator.add(10, 10));
    }

    @Test
    @DisplayName("test Subtract")
    void testSubtract(TestInfo testInfo)
    {
        assertEquals(0, myCalculator.subtract(10, 10));
    }

    @Test
    @DisplayName("test Multiply")
    void testMultiply(TestInfo testInfo)
    {
        assertEquals(100, myCalculator.multiply(10, 10));
    }

    @Test
    @DisplayName("test Divide")
    void testDivide(TestInfo testInfo)
    {
        assertEquals(1, myCalculator.divide(10, 10));
    }

    @AfterAll
    @DisplayName("Testing complete")
    public static void done(){
        System.out.println("Testing Complete");
    }
}
