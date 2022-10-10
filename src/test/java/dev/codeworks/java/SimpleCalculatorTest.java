package dev.codeworks.java;

import junit.framework.TestCase;

public class SimpleCalculatorTest extends TestCase {

    SimpleCalculator simpleCalculator;

    @Override
    protected void setUp() throws Exception {
        simpleCalculator = new SimpleCalculator();
    }

    public void testAddTwoNumbers() {
        assertEquals(-3d,simpleCalculator.addTwoNumbers(3d,-6d));
    }

    @Override
    protected void tearDown() throws Exception {
        simpleCalculator = null;
    }
}