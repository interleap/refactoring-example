package co.example;

import java.util.Scanner;

import static java.util.stream.IntStream.range;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(isSumOfPrimes(n));
    }

    static boolean isSumOfPrimes(int number) {
        return range(2, number / 2 + 1).anyMatch((i) -> (isPrime(i) && isPrime(number - i)));
    }

    private static boolean isPrime(int number) {
        return range(2, number / 2 + 1).allMatch(j -> number % j != 0);
    }
}
