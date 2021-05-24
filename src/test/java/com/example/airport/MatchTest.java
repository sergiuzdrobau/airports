package com.example.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatchTest {

    Match match = new Match();


    @Test
    void ariaPatrat() {
        int actual = match.ariaPatrat(5);
        int expected = 25;
        assertEquals(expected,actual);
    }

    @Test
    void perimetruPatrat() {
        int actual = match.perimetruPatrat(4);
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    void perimetruDreptunghi() {
        int actual = match.perimetruDreptunghi(3,8);
        int expected = 22;
        assertEquals(expected, actual);
    }

    @Test
    void isEquilateral() {
        boolean actual = match.isEquilateral(5,5,5);
        assertTrue(actual);
    }
}
