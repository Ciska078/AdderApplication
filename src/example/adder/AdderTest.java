package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        assertEquals(8, Adder.add(3, 5));
    }

    @Test
    void shouldAddPositiveAndNegativeNumbers() {
        assertEquals(2, Adder.add(5, -3));
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        assertEquals(-8, Adder.add(-3, -5));
    }

    @Test
    void shouldReturnZeroWhenAddingZero() {
        assertEquals(0, Adder.add(0, 0));
    }

    @Test
    void securityShouldPreserveJavaIntBoundaryBehaviour() {
        assertEquals(
                Integer.MIN_VALUE,
                Adder.add(Integer.MAX_VALUE, 1)
        );
    }
}
