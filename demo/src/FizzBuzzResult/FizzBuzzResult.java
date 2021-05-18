package FizzBuzzResult;

public class FizzBuzzResult {
    public static String Check(int x) {
        boolean isFizz = x%3 == 0;
        boolean isBuzz = x%5 == 0;
        if (isFizz&&isBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if ( isBuzz) {
            return "Buzz";
        }
        return "none " + x;
    }
}
