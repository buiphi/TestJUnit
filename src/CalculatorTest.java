import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void testAdd() {
        int result = Calculator.add(5, 10);
        assertEquals(15, result);
    }
}
