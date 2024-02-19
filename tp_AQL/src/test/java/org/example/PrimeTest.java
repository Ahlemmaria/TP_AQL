package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

        @Test
        public void TestPourNbrPremier() {
            assertTrue(Prime.isPrime(2));
            assertTrue(Prime.isPrime(3));
        }

        @Test
        public void TestPourNbrNPremier() {
            assertFalse(Prime.isPrime(4));
            assertFalse(Prime.isPrime(6));
        }

        @Test
        public void TestPourNbrPremierInf2() {
            assertFalse(Prime.isPrime(1));
        }
    }

