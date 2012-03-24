package foo.bar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestResultFormatter{
    
    private ResultFormatter formatter;
    
    @Before
    public void before() {
        formatter = new ResultFormatter();
        
    }
    
    @After
    public void after() {
        formatter = null;
    }
    
    @Test
    public void testJsonFormat() {
        try {
            String result = formatter.formatAsJson(3.5);
            assertEquals("{\"result\":3.5}", result);
        } catch (Exception e) {
            fail("Exception not expected.");
        }

    }
}
