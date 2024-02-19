package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYear_ModTest {


        @Test
        public void leapYearsThatAreNonCenturialYears() {
            LeapYear_Mod ly = new LeapYear_Mod();
            boolean result = ly.isLeapYear(2016);
            Assertions.assertTrue(result);
        }
        @Test
        public void leapCenturialYears() {
            LeapYear_Mod ly = new LeapYear_Mod();
            Assertions.assertTrue(ly.isLeapYear(2000));
        }
        @Test
        public void nonLeapCenturialYears() {
            LeapYear_Mod ly = new LeapYear_Mod();
            Assertions.assertFalse(ly.isLeapYear(1500));
        }

        @Test
        public void nonLeapYears() {
            LeapYear_Mod ly = new LeapYear_Mod();
            Assertions.assertFalse(ly.isLeapYear(2017));
        }
    }