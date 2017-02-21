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

            } else if (token.equals("-")) {

            } else if (token.equals("*")) {

            } else if (token.equals("/")) {

            }
            stack.push(Integer.parseInt(input));
        }
        return 0;
    }
}
