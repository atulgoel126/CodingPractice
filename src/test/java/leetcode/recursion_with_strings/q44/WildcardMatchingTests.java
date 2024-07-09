package leetcode.recursion_with_strings.q44;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.recursion_with_strings.q44.WildcardMatching;

public class WildcardMatchingTests {
    private WildcardMatching ob = new WildcardMatching();

    @Test
    public void testEmptyPattern() {
        String s = "abcd";
        String pattern = "";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testEmptyString() {
        String s = "";
        String pattern = "a*b*c*";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testExactMatch() {
        String s = "abcd";
        String pattern = "abcd";
        assertTrue(ob.isMatch(s, pattern));
    }
    
    @Test
    public void testMultipleWildcards() {
        String s = "aabbcde";
        String pattern = "a*bcde";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testSingleWildcard() {
        String s = "leetcode";
        String pattern = "le*td*de";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testWildcardAtBeginning() {
        String s = "leetcode";
        String pattern = "*etcode";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testWildcardAtEnd() {
        String s = "leetcode";
        String pattern = "leetcod*";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testNoMatch() {
        String s = "abcd";
        String pattern = "def";
        assertFalse(ob.isMatch(s, pattern));
    }

    @Test
    public void testMultiCharacterWildcard() {
        String s = "leetcode";
        String pattern = "le*t?o*e";
        assertTrue(ob.isMatch(s, pattern));
    }

    @Test
    public void testEdgeCases() {
        String s1 = "";
        String pattern1 = "*";
        assertTrue(ob.isMatch(s1, pattern1));

        String s2 = "a";
        String pattern2 = "**a**";
        assertTrue(ob.isMatch(s2, pattern2));

        String s3 = "abcd";
        String pattern3 = "?b*c*d*";
        assertTrue(ob.isMatch(s3, pattern3));
    }
}