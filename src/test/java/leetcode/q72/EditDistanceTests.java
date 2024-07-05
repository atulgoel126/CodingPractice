package leetcode.q72;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.q72.EditDistance;

public class EditDistanceTests {
    @Test
    public void testCase1() {
        EditDistance ob = new EditDistance();
        assertEquals(3, ob.minDistance("horse", "ros"));
    }

    @Test
    public void testCase2() {
        EditDistance ob = new EditDistance();
        assertEquals(5, ob.minDistance("intention", "execution"));
    }

    @Test
    public void testCase3() {
        EditDistance ob = new EditDistance();
        assertEquals(0, ob.minDistance("", ""));
    }

    @Test
    public void testCase4() {
        EditDistance ob = new EditDistance();
        assertEquals(3, ob.minDistance("abc", ""));
    }

    @Test
    public void testCase5() {
        EditDistance ob = new EditDistance();
        assertEquals(3, ob.minDistance("", "abc"));
    }

    @Test
    public void testCase6() {
        EditDistance ob = new EditDistance();
        assertEquals(0, ob.minDistance("abc", "abc"));
    }

    @Test
    public void testCase7() {
        EditDistance ob = new EditDistance();
        assertEquals(3, ob.minDistance("kitten", "sitting"));
    }

    @Test
    public void testCase8() {
        EditDistance ob = new EditDistance();
        assertEquals(2, ob.minDistance("flaw", "lawn"));
    }

    @Test
    public void testCase9() {
        EditDistance ob = new EditDistance();
        assertEquals(6, ob.minDistance("algorithm", "altruistic"));
    }

    @Test
    public void testCase10() {
        EditDistance ob = new EditDistance();
        assertEquals(1, ob.minDistance("a", "b"));
    }

    @Test
    public void testCase11() {
        // Test case where change is so large that memoization would be needed
        String longWord1 = "abcde" + "fghijklmnopqrstuvwxyz".repeat(10);
        String longWord2 = "pqrst" + "uvwxyzabcdefghijklmno".repeat(10);
        EditDistance ob = new EditDistance();
        assertEquals(112, ob.minDistance(longWord1, longWord2));
    }
}
