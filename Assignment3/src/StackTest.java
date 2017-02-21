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
}
