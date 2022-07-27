package chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTDDTest {

    @Test
    @DisplayName("When the I fizzbuzz 1, then I should get 1 back")
    void shouldFizzBuzzOne() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(1);
        assertEquals("1", testFizzBuzz.test(1));
    }

    @Test
    @DisplayName("When the I fizzbuzz 2, then I should get 2 back")
    void shouldFizzBuzzTwo() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(2);
        assertEquals("2", testFizzBuzz.test(2));
    }

    @Test
    @DisplayName("When the I fizzbuzz 3, then I should get Fizz back")
    void shouldFizzBuzzThree() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(3);
        assertEquals("Fizz", testFizzBuzz.test(3));
    }

    @Test
    @DisplayName("When the I fizzbuzz 5, then I should get Buzz back")
    void shouldFizzBuzzFive() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(5);
        assertEquals("Buzz", testFizzBuzz.test(5));
    }

    @Test
    @DisplayName("When the I fizzbuzz 15, then I should get FizzBuzz back")
    void shouldFizzBuzzThreeAndFive() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(15);
        assertEquals("FizzBuzz", testFizzBuzz.test(15));
    }
    @Test
    @DisplayName("When the I input a number, then I should get the number back")
    void shouldReturnTheNumber() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(43);
        assertEquals("43", testFizzBuzz.test(43));
    }

    @Test
    @DisplayName("When the I input a number, then I should get the number back")
    void shouldNull() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(210);
        assertNull(testFizzBuzz.test(210));
    }
}
