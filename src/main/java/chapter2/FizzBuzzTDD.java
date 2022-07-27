package chapter2;

public class FizzBuzzTDD {
    public String test(int i) {

        if (i >= 1 && i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            }
            return Integer.toString(i);
        }
        return null;
    }
}
