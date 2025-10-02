package ch.bbw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

Calculator calculator;

@BeforeEach
void setUp() {
    calculator = new Calculator();
}

    @Test
    void add_1_plus_1() {
        int a = 1;
        int b = 1;

        int result = calculator.add(a, b);

        assertEquals(a + b, result, "addition failed");
    }

    @Test
    void add_2_plus_2() {
        int a = 2;
        int b = 2;

        int result = calculator.add(a, b);

        assertEquals(a + b, result, "addition failed");
    }

    @Test
    void add_1_plus_2() {
        int a = 1;
        int b = 2;

        int result = calculator.add(a, b);

        assertTrue(result == a + b, "addition failed");
    }

    @Test
    void subtract_1_minus_1() {
        int a = 1;
        int b = 1;

        int result = calculator.subtract(a, b);

        assertEquals(a - b, result, "subtraction failed");
    }

    @Test
    void subtract_2_minus_1() {
        int a = 2;
        int b = 1;

        int result = calculator.subtract(a, b);

        assertEquals(a - b, result, "subtraction failed");
    }

    @Test
    void subtract_3_minus_5() {
        int a = 3;
        int b = 5;

        int result = calculator.subtract(a, b);

        assertTrue(result == a - b, "subtraction failed");
    }
    
    @Test
    void multiply_1_with_2() {
        int a = 1;
        int b = 2;

        int result = calculator.multiply(a, b);

        assertEquals(a * b, result, "addition failed");
    }
}