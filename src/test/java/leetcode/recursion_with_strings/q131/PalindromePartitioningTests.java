package leetcode.recursion_with_strings.q131;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.recursion_with_strings.q131.PalindromePartitioning;

import java.util.Arrays;
import java.util.List;

public class PalindromePartitioningTests {
    @Test
    public void testValidPalindromeInput() {
        PalindromePartitioning ob = new PalindromePartitioning();
        String input = "aabcb";
        List<List<String>> output = ob.partition(input);

        //assert that the output contains the correct number of partitions
        assertEquals(3, output.size());

        //assert that the first partition is ["a", "a", "b", "c", "b"]
        List<String> firstPartition = Arrays.asList("a", "a", "b", "c", "b");
        assertTrue(output.contains(firstPartition));

        //assert that the second partition is ["aa", "b", "c", "b"]
        List<String> secondPartition = Arrays.asList("aa", "b", "c", "b");
        assertTrue(output.contains(secondPartition));

        //assert that the third partition is ["a", "abc", "b"]
        List<String> thirdPartition = Arrays.asList("a", "abc", "b");
        assertTrue(output.contains(thirdPartition));
    }

    @Test
    public void testEmptyInput() {
        PalindromePartitioning ob = new PalindromePartitioning();
        String input = "";
        List<List<String>> output = ob.partition(input);

        //assert that the output contains an empty list for an empty input
        List<String> emptyList = Arrays.asList();
        assertTrue(output.contains(emptyList));

        //assert that the output has only one partition (an empty list)
        assertEquals(1, output.size());
    }

    @Test
    public void testSingleCharacterInput() {
        PalindromePartitioning ob = new PalindromePartitioning();
        String input = "a";
        List<List<String>> output = ob.partition(input);

        //assert that the output contains only one partition (with the input character)
        assertEquals(1, output.size());

        //assert that the partition is ["a"]
        List<String> partition = Arrays.asList("a");
        assertTrue(output.contains(partition));
    }

    @Test
    public void testAllCharactersSameInput() {
        PalindromePartitioning ob = new PalindromePartitioning();
        String input = "aaaaa";
        List<List<String>> output = ob.partition(input);

        //assert that the output contains n partitions (where n is the length of input)
        assertEquals(input.length(), output.size());

        //assert that each partition contains only one character
        for (List<String> partition : output) {
            assertEquals(1, partition.size());
        }

        //assert that each partition contains the same character
        for (List<String> partition : output) {
            String character = partition.get(0);
            assertTrue(character.equals("a"));
        }
    }

    @Test
    public void testNullInput() {
        PalindromePartitioning ob = new PalindromePartitioning();
        String input = null;
        List<List<String>> output = ob.partition(input);

        //assert that the output is null for a null input
        assertNull(output);
    }
}