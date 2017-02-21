/**
 * Created by dmd383 on 2/21/2017.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    public void StackTest(){
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }
    @Test
    public void CalculatorTestAddition()    {
        Calculator calculator = new Calculator();
        int result = calculator.performCalculation("1 2 +");
        assertEquals(3,result);
    }@Test
    public void CalculatorTestMinus()    {
        Calculator calculator = new Calculator();
        int result = calculator.performCalculation("1 2 -");
        assertEquals(1,result);
    }@Test
    public void CalculatorTestMultiplication()    {
        Calculator calculator = new Calculator();
        int result = calculator.performCalculation("2 3 *");
        assertEquals(6,result);
    }@Test
    public void CalculatorTestDivision()    {
        Calculator calculator = new Calculator();
        int result = calculator.performCalculation("2 4 /");
        assertEquals(2,result);
    }
}
