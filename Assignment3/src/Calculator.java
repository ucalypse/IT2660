import java.util.StringTokenizer;

/**
 * Created by dmd383 on 2/21/2017.
 */
public class Calculator {

    Stack stack = new Stack();

    public int performCalculation(String input) {
        StringTokenizer parse = new StringTokenizer(input, "0123456789+-*/", true);
        while (parse.hasMoreTokens()) {
            String token = parse.nextToken();
            if (token.equals("+")) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(operand1 / operand2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
