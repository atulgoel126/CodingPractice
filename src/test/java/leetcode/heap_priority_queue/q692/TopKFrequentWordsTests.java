//package leetcode.heap_priority_queue.q692;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.heap_priority_queue.q692.TopKFrequentWords;
//
//import java.util.Arrays;
//
//public class TopKFrequentWordsTests {
//
//    // test case for empty input array
//    @Test
//    public void testEmptyArray() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {};
//        String[] expectedOutput = {};
//        int k = 1;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected and actual outputs are equal
//        assertArrayEquals(expectedOutput, actualOutput);
//    }
//
//    // test case for input array with single element and k = 1
//    @Test
//    public void testSingleElement() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"hello"};
//        String[] expectedOutput = {"hello"};
//        int k = 1;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected and actual outputs are equal
//        assertArrayEquals(expectedOutput, actualOutput);
//    }
//
//    // test case for input array with multiple elements and k = 1
//    @Test
//    public void testMultipleElements() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"hello", "hello", "world", "world", "world"};
//        String[] expectedOutput = {"world"};
//        int k = 1;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected and actual outputs are equal
//        assertArrayEquals(expectedOutput, actualOutput);
//    }
//
//    // test case for input array with multiple elements and k greater than number of unique elements
//    @Test
//    public void testKGreaterThanUniqueElements() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"i", "love", "leetcode", "i", "love", "coding"};
//        String[] expectedOutput = {"i", "love"};
//        int k = 3;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//
//        // check if all the expected output's elements are present in the actual output
//        for (String s : expectedOutput) {
//            assertTrue(Arrays.asList(actualOutput).contains(s));
//        }
//    }
//
//    // test case for input array with duplicate elements and k equal to number of unique elements
//    @Test
//    public void testDuplicateElements() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"i", "love", "leetcode", "i", "love", "coding", "leetcode"};
//        String[] expectedOutput = {"i", "love", "leetcode"};
//        int k = 3;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//
//        // check if all the expected output's elements are present in the actual output
//        for (String s : expectedOutput) {
//            assertTrue(Arrays.asList(actualOutput).contains(s));
//        }
//    }
//
//    // test case for input array with varying lengths of elements
//    @Test
//    public void testVaryingLengths() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"i", "love", "leetcode", "i", "love", "coding", "leetcode", "leetcode", "leetcode", "code"};
//        String[] expectedOutput = {"leetcode", "i", "love"};
//        int k = 3;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//
//        // check if all the expected output's elements are present in the actual output
//        for (String s : expectedOutput) {
//            assertTrue(Arrays.asList(actualOutput).contains(s));
//        }
//    }
//
//    // test case for input array with special characters and k = 2
//    @Test
//    public void testSpecialCharacters() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"!@#$", "%^&*", "*()_", "!@#$"};
//        String[] expectedOutput = {"!@#$", "*()_"};
//        int k = 2;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//
//        // check if all the expected output's elements are present in the actual output
//        for (String s : expectedOutput) {
//            assertTrue(Arrays.asList(actualOutput).contains(s));
//        }
//    }
//
//    // test case for input array with all unique elements and k = length of input array
//    @Test
//    public void testUniqueElements() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"1", "2", "3", "4", "5", "6"};
//        String[] expectedOutput = {"1", "2", "3", "4", "5", "6"};
//        int k = input.length;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected and actual outputs are equal
//        assertArrayEquals(expectedOutput, actualOutput);
//    }
//
//    // test case for input array with all duplicate elements and k = 1
//    @Test
//    public void testAllDuplicates() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"a", "a", "a"};
//        String[] expectedOutput = {"a"};
//        int k = 1;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected and actual outputs are equal
//        assertArrayEquals(expectedOutput, actualOutput);
//    }
//
//    // test case for null input array
//    @Test
//    public void testNullArray() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = null;
//        int k = 1;
//
//        // check if IllegalArgumentException is thrown when input array is null
//        assertThrows(IllegalArgumentException.class, () -> {
//            ob.topKFrequent(input, k);
//        });
//    }
//
//    // test case for negative value of k
//    @Test
//    public void testNegativeK() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"a", "b", "c"};
//        int k = -2;
//
//        // check if IllegalArgumentException is thrown when k is negative
//        assertThrows(IllegalArgumentException.class, () -> {
//            ob.topKFrequent(input, k);
//        });
//    }
//
//    // test case for k greater than input array's length
//    @Test
//    public void testKGreaterThanInputLength() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"hello", "hello", "world", "world", "world"};
//        int k = 10;
//
//        // check if IllegalArgumentException is thrown when k is greater than input array's length
//        assertThrows(IllegalArgumentException.class, () -> {
//            ob.topKFrequent(input, k);
//        });
//    }
//
//    // test case for empty strings in input array
//    @Test
//    public void testEmptyStrings() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"", "", "hello", "world", "", "world"};
//        String[] expectedOutput = {"", "world"};
//        int k = 2;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//
//        // check if all the expected output's elements are present in the actual output
//        for (String s : expectedOutput) {
//            assertTrue(Arrays.asList(actualOutput).contains(s));
//        }
//    }
//
//    // test case for input array with null elements
//    @Test
//    public void testNullElements() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {"hello", "hello", null, "world", "world"};
//        String[] expectedOutput = {"hello", "world"};
//        int k = 2;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//
//        // check if all the expected output's elements are present in the actual output
//        for (String s : expectedOutput) {
//            assertTrue(Arrays.asList(actualOutput).contains(s));
//        }
//    }
//
//    // test case for empty input array and k = 0
//    @Test
//    public void testEmptyArrayWithKZero() {
//        TopKFrequentWords ob = new TopKFrequentWords();
//        String[] input = {};
//        String[] expectedOutput = {};
//        int k = 0;
//        String[] actualOutput = ob.topKFrequent(input, k);
//
//        // check if the expected output's length matches the actual output's length
//        assertEquals(expectedOutput.length, actualOutput.length);
//    }
//}