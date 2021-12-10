package co.example;

import org.junit.jupiter.api.Test;

import static co.example.Main.isSumOfPrimes;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void verifyIfNumberIsSumOfPrimes() {
        assertFalse(isSumOfPrimes(1));
        assertFalse(isSumOfPrimes(2));
        assertFalse(isSumOfPrimes(3));
        assertTrue(isSumOfPrimes(4));
        assertTrue(isSumOfPrimes(5));
        assertTrue(isSumOfPrimes(10));
        assertFalse(isSumOfPrimes(11));
        assertFalse(isSumOfPrimes(17));
        assertTrue(isSumOfPrimes(18));
    }
}