package com.powermilk;

import org.junit.jupiter.api.*;
import org.junit.platform.suite.api.SelectPackages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Solution class")
@SelectPackages("com.powermilk")
public class SolutionTest {
    private static final Logger log = LoggerFactory.getLogger(SolutionTest.class);

    @BeforeAll
    static void setup() {
        log.info("--- Test suite for Solution class started ---");
    }

    @AfterAll
    static void finish() {
        log.info("--- Test suite for Solution class finished ---");
    }

    @BeforeEach
    void init() {
        log.info("Test started!");
    }

    @AfterEach
    void tearDown() {
        log.info("Test finished!");
    }

    @Test
    @DisplayName("Test should passed for data provided by first example")
    public void shouldPassForExampleArray() {
        int[] A = {1, 2, 3};

        int expected = 1;
        int actual = new Solution().solution(A);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test should passed for empty array")
    public void shouldPassForEmptyArray() {
        int[] A = {};

        int expected = 0;
        int actual = new Solution().solution(A);

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test should passed for custom data")
    public void shouldPassForCustomArray() {
        int[] A = { 2, 3, 1, 1, 3 };

        int expected = 1;
        int actual = new Solution().solution(A);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test should passed for another custom data")
    public void shouldPassForSecondCustomArray() {
        int[] A = { 1, 1, -1, 1 };

        int expected = 1;
        int actual = new Solution().solution(A);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test should passed for data provided by second example")
    public void shouldPassForSecondExampleArray() {
        int[] A = { 3, -5, 0, -1, -3 };

        int expected = 2;
        int actual = new Solution().solution(A);

       assertEquals(expected, actual);
    }
}
