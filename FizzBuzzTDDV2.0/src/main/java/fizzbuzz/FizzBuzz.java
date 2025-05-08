package fizzbuzz;

public class FizzBuzz {
    public static String getReturnInt(int number) {
//        if (number == 1) {
//            return String.valueOf(number);
//        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
