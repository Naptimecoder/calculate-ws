package foo.bar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestCalculateArea {
    
    private CalculateArea calculator;
    
    @Before
    public void before() {
        calculator = new CalculateArea();
        
    }
    
    @After
    public void after() {
        calculator = null;
    }

    @Test
    public void testCalculateAreaOfASquare() {
        double side = 5;
        double result = calculator.calculateSquare(side);
        assertEquals(25.0, result);
        
        side = 0;
        result = calculator.calculateSquare(side);
        assertEquals(0.0, result);
        
    }

    @Test
    public void testCalculateAreaOfARectangle() {
        double height = 3;
        double width = 5;
        double result = calculator.calculateRectangle(width, height);
        assertEquals(15.0, result);
        
        height = 0;
        width = 2;
        result = calculator.calculateRectangle(width, height);
        assertEquals(0.0, result);
    }

    @Test
    public void testCalculateAreaOfATriangle() {
        double base = 2;
        double height = 3;
        double result = calculator.calculateTriangle(base, height);
        assertEquals(3.0, result);
        
        base = 3;
        height = 5;
        result = calculator.calculateTriangle(base, height);
        assertEquals(7.5, result);
        
        base = 0;
        height = 2;
        result = calculator.calculateTriangle(base, height);
        assertEquals(0.0, result);
    }

}
