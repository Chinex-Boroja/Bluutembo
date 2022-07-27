package chapter3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatCalculatorTest {

    int[] numArray = {6, 9, 15, -2, 92, 11};

    @Test
    void shouldReturnMinimumValue(){
        StatCalculator testStat = new StatCalculator();
        assertEquals(-2, testStat.minimumValue(numArray));
    }

    @Test
    void shouldReturnMaximumValue(){
        StatCalculator testStat = new StatCalculator();
        assertEquals(92, testStat.maximumValue(numArray));

    }

    @Test
    void shouldFindNumberOfElement() {
        StatCalculator testStat = new StatCalculator();
        assertEquals(6, testStat.numElement(numArray));
    }

    @Test
    void shouldFindAverageNumberOfElements() {
        StatCalculator testStat = new StatCalculator();
        assertEquals( "21.833333", testStat.numAverage(numArray));
    }
}
