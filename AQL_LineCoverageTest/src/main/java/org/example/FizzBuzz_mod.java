package org.example;

public class FizzBuzz_mod {
    public static String fizzBuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(n);
    }
}
