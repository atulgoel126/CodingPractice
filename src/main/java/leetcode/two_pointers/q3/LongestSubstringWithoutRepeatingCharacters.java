package leetcode.two_pointers.q3;

import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     finds the length of the longest substring without any repeating character
     @param s String: input string to be evaluated
     */
    public int lengthOfLongestSubstring(String s) {

        // This data structure will store the current subString, will preserve the order of insertion
        LinkedHashSet<Character> subString = new LinkedHashSet<>();
        int maxSize = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            removeDuplicates(subString, ch);
            subString.add(ch);
            maxSize = Math.max(maxSize, subString.size());
        }
        return maxSize;
    }

    /**
     removes all characters from start to the index at which @param ch is found
     */
    private void removeDuplicates(LinkedHashSet<Character> subString, char ch) {
        while (subString.contains(ch)) {
            // remove all existing characters until ch
            subString.remove(subString.iterator().next());
        }
    }
}
