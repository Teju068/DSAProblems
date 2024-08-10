package org.aimids.SlidingWindowTwoPointer;

import java.util.HashMap;

public class SlidingWindowTwoPointer {

    /**
     * @param input String
     */
    // BRUTE FORCE
    public void printAllSubStringBF(String input) {
        int length = input.length();
        String sub = "";
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                sub = sub + input.charAt(j);
                System.out.println(sub);
            }
            sub = "";
        }
    }

    /**
     * @param input String
     * @return length of substring without repeating characters
     */
    // BRUTE FORCE
    public int longestSbStringWithoutRepeatingCharBF(String input) {
        int length = input.length();
        int output = -1;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            hashMap.clear();
            for (int j = i; j < length; j++) {
                if (!hashMap.containsKey(input.charAt(j))) {
                    hashMap.put(input.charAt(j), 1);
                    int newLength = j - i + 1;
                    if (newLength > output) {
                        output = newLength;
                    }
                } else {
                    break;
                }
            }
        }
        return output;
    }

    /**
     * @param input String
     * @return substring without repeating characters
     */
    // BRUTE FORCE
    public String subStringWithoutRepeatingCharBF(String input) {
        int length = input.length();
        int output = -1;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String subStringOutPut = "";

        for (int i = 0; i < length; i++) {
            hashMap.clear();
            for (int j = i; j < length; j++) {
                if (!hashMap.containsKey(input.charAt(j))) {
                    hashMap.put(input.charAt(j), 1);
                    int newLength = j - i + 1;
                    if (newLength > output) {
                        output = newLength;
                        subStringOutPut = input.substring(i, j + 1);
                    }
                } else {
                    break;
                }
            }
        }
        return subStringOutPut;
    }

    /**
     * @param input String
     * @return length substring without repeating characters
     */
    // OPTIMAL
    public int longestSubStringWithoutRepeatingCharOP(String input) {
        int length = input.length();
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int MAX_LENGTH = 0;
        while (r < length) {
            if (hashMap.containsKey(input.charAt(r))) {
                l = Math.max(hashMap.get(input.charAt(r)) + 1, l);
            }
            hashMap.put(input.charAt(r), r);
            MAX_LENGTH = Math.max((r - l + 1), MAX_LENGTH);
            r++;
        }
        return MAX_LENGTH;
    }

}
