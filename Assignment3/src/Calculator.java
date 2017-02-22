import java.util.StringTokenizer;

/**
 * Created by dmd383 on 2/21/2017.
 */
public class Calculator {

    Stack stack = new Stack();

    public int performCalculation(String input) {
        StringTokenizer parse = new StringTokenizer(input, " ");
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
                if (operand2 != 0) {
                    stack.push(operand1 / operand2);
                }
                else    {
                    System.out.println("Cannot divide by 0");
                    System.exit(0);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
