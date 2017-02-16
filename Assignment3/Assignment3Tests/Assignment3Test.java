import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Assignment3Test {
    CustomQueue tester = new CustomQueue();

    @Test
    public void getTokensSplitsOnOperator()    {
        String testString = "1 2 3 4 5 + +";
        StringTokenizer stringTokenizer = tester.getTokens(testString);

        assertEquals(stringTokenizer.nextToken(), "1");
        assertEquals(stringTokenizer.nextToken(), "2");
        assertEquals(stringTokenizer.nextToken(), "3");
        assertEquals(stringTokenizer.nextToken(), "4");
        assertEquals(stringTokenizer.nextToken(), "5");
        assertEquals(stringTokenizer.nextToken(), "+");
        assertEquals(stringTokenizer.nextToken(), "+");

    }

    @Test
    public void performCalculationReturnsIntArray() {
        String testString = "1 2 3 4 5 + +";
        String[] test = tester.performCalculation(testString);

        assertEquals(test[0], "1");
        assertEquals(test[1], "2");
        assertEquals(test[2], "3");
        assertEquals(test[3], "4");
        assertEquals(test[4], "5");

    }

}