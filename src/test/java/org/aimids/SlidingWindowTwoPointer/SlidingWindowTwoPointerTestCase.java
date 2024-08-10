package org.aimids.SlidingWindowTwoPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlidingWindowTwoPointerTestCase {

    SlidingWindowTwoPointer slidingWindowTwoPointer = new SlidingWindowTwoPointer();

    /**
     * Print All Sub String
     * (n(n+1))/2 total combination for string
     */
    @Test
    public void printAllSubStringBF1() {
        String input = "abcdefgh";
        slidingWindowTwoPointer.printAllSubStringBF(input);
    }

    @Test
    public void printAllSubStringBF4() {
        String input = "abc";
        slidingWindowTwoPointer.printAllSubStringBF(input);
    }


    /**
     * Longest substring without repeating  characters
     */
    @Test
    public void longestSbStringWithoutRepeatingCharBF1() {
        String input = "cabdzabcd";
        int size = slidingWindowTwoPointer.longestSbStringWithoutRepeatingCharBF(input);
        assertEquals(size, 5);
    }

    @Test
    public void longestSbStringWithoutRepeatingCharBF2() {
        String input = "caabdefghijjkl";
        int size = slidingWindowTwoPointer.longestSbStringWithoutRepeatingCharBF(input);
        assertEquals(size, 9);
    }

    @Test
    public void longestSbStringWithoutRepeatingCharBF3() {
        String input = "caaaaaaaa";
        int size = slidingWindowTwoPointer.longestSbStringWithoutRepeatingCharBF(input);
        assertEquals(size, 2);
    }

    /**
     * Longest substring without repeating  characters
     */
    @Test
    public void longestSbStringWithoutRepeatingCharOP1() {
        String input = "cabdzabcd";
        int size = slidingWindowTwoPointer.longestSubStringWithoutRepeatingCharOP(input);
        assertEquals(size, 5);
    }

    @Test
    public void longestSbStringWithoutRepeatingCharOP2() {
        String input = "caabdefghijjkl";
        int size = slidingWindowTwoPointer.longestSubStringWithoutRepeatingCharOP(input);
        assertEquals(size, 9);
    }

    @Test
    public void longestSbStringWithoutRepeatingCharOP3() {
        String input = "caaaaaaaa";
        int size = slidingWindowTwoPointer.longestSubStringWithoutRepeatingCharOP(input);
        assertEquals(size, 2);
    }

    @Test
    public void longestSbStringWithoutRepeatingCharOP4() {
        String input = "tmmzuxt";
        int size = slidingWindowTwoPointer.longestSubStringWithoutRepeatingCharOP(input);
        assertEquals(size, 5);
    }


    /**
     * substring without repeating  characters
     */
    @Test
    public void subStringWithoutRepeatingCharBF1() {
        String input = "cabdzabcd";
        String subString = slidingWindowTwoPointer.subStringWithoutRepeatingCharBF(input);
        assertEquals(subString, "cabdz");
    }

    @Test
    public void subStringWithoutRepeatingCharBF2() {
        String input = "caabdefghijjkl";
        String subString = slidingWindowTwoPointer.subStringWithoutRepeatingCharBF(input);
        assertEquals(subString, "abdefghij");
    }

    @Test
    public void subStringWithoutRepeatingCharBF3() {
        String input = "caaaaaaaa";
        String subString = slidingWindowTwoPointer.subStringWithoutRepeatingCharBF(input);
        assertEquals(subString, "ca");
    }

    @Test
    public void subStringWithoutRepeatingCharBF4() {
        String input = "caabdefg";
        String subString = slidingWindowTwoPointer.subStringWithoutRepeatingCharBF(input);
        assertEquals(subString, "abdefg");
    }

}
