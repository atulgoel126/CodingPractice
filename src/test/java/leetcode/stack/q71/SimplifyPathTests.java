package leetcode.stack.q71;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.stack.q71.SimplifyPath;

public class SimplifyPathTests {
//    @Test
//    public void testEmptyPath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testRootPath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testSinglePath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home";
//        String expectedOutput = "/home";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testMultiplePaths() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/test/../user";
//        String expectedOutput = "/home/user";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testRepeatedSlash() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home//user";
//        String expectedOutput = "/home/user";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testAbsolutePath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/../user";
//        String expectedOutput = "/user";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testRelativePath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "home/../user";
//        String expectedOutput = "/user";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testMultipleDot() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/user/././test/../";
//        String expectedOutput = "/home/user";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testParentDirectory() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/user/../../test";
//        String expectedOutput = "/test";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testBackToPreviousDirectory() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/user/../../../test";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testDoubleDotInPath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/../user/../other";
//        String expectedOutput = "/other";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testNoParentDirectory() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/user/test";
//        String expectedOutput = "/home/user/test";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testEdgeCase() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home//test///user/../other//";
//        String expectedOutput = "/home/test/other";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testDotPath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/.";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testDotDotPath() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/..";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testMixedPaths() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/home/user/./../other/././../../../test/../final";
//        String expectedOutput = "/final";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testEmptyPathOutput() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testRootPathOutput() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "/";
//        String expectedOutput = "/";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testEmptyStringInput() {
//        SimplifyPath ob = new SimplifyPath();
//        String input = "";
//        String expectedOutput = "";
//        assertEquals(expectedOutput, ob.simplifyPath(input));
//    }
//
//    @Test
//    public void testNullInput() {
//        SimplifyPath ob = new SimplifyPath();
//        String expectedOutput = null;
//        assertEquals(expectedOutput, ob.simplifyPath(null));
//    }
}