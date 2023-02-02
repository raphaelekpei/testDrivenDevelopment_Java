package testClass;

import actualClass.SimpleCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    private SimpleCalculator simpleCalculator;
    @BeforeEach
    void setUp(){
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void simpleCalculatorObjectCanBeCreated(){
        assertNotNull(simpleCalculator);
    }
    @Test
    public void simpleCalculatorCanAddTwoNumbers(){

        assertEquals(8, simpleCalculator.add(4, 4));
        assertEquals(10, simpleCalculator.add(2, 8));
        assertEquals(0, simpleCalculator.add(0, 0));
        assertEquals(101, simpleCalculator.add(100, 1));
        assertEquals(10, simpleCalculator.add(2, 8));
        assertEquals(-6, simpleCalculator.add(-10, 4));
        assertEquals(-6, simpleCalculator.add(4, -10));
        assertEquals(5, simpleCalculator.add(-15, 20));
    }

    @Test
    public void simpleCalculatorCanSubtractTwoNumbers(){
        // Given that I have a simpleCalculator
        // When I try to subtract two numbers

        assertEquals(10, simpleCalculator.subtract(15, 5));
        assertEquals(-3, simpleCalculator.subtract(-14, -11));
    }

    @Test
    public void simpleCalculatorCanMultiplyTwoNumbers(){
        // Given that I have a simpleCalculator
        // When I try to subtract multiply two numbers
        // Then
        assertEquals(12, simpleCalculator.multiply(2, 6));
    }
    @Test
    public void simpleCalculatorCanDivideTwoNumbers(){
        // Given that I have a calculator
        // When I try to divide a number by another
        // Then
        assertEquals(8, simpleCalculator.divide(16, 2));
    }

    @Test
    public void simpleCalculatorCanGetTheSquareRootOfNumber(){
        // Given that I have a calculator
        // When I try to get the square root of a number
        // Then
        assertEquals(2, simpleCalculator.squareRoot(4));
    }

    @Test
    public void simpleCalculatorCanGetTheSquareOfNumber(){
        // Given that I have a calculator
        // When I try to get the square of a number
        // Then
        assertEquals(64, simpleCalculator.square(8));
    }

    @Test
    public void simpleCalculatorCanGetTheCubeRootOfNumber(){
        // Given that I have a calculator
        // When I try to get the cube root of a number
        // Then
        assertEquals(3, simpleCalculator.cubeRoot(27));
    }
    @Test
    public void simpleCalculatorCanGetTheCubeOfNumber(){
        // Given that I have a simpleCalculator
        // When I try to get the cube of a number
        // Then
        assertEquals(125,simpleCalculator.cube(5));
    }

}
