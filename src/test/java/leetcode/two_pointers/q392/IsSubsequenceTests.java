//package leetcode.two_pointers.q392;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.two_pointers.q392.IsSubsequence;
//
//public class IsSubsequenceTests {
//
//	@Test
//    public void testPositiveInput() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "abc";
//        String t = "ahbgdc";
//        assertTrue(ob.isSubsequence(s, t));
//    }
//
//	@Test
//    public void testSingleCharacterInput() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "a";
//        String t = "b";
//        assertFalse(ob.isSubsequence(s, t));
//    }
//
//    @Test
//    public void testEmptyInput() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "";
//        String t = "abc";
//        assertTrue(ob.isSubsequence(s, t));
//    }
//
//    @Test
//    public void testEmptyStrings() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "";
//        String t = "";
//        assertTrue(ob.isSubsequence(s, t));
//    }
//
//    @Test
//    public void testLongStrings() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "iamsubsequence";
//        String t = "iamnotsubsequence";
//        assertFalse(ob.isSubsequence(s, t));
//    }
//
//    @Test
//    public void testEdgeCases() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "abb";
//        String t = "abcdaabab";
//        assertFalse(ob.isSubsequence(s, t));
//    }
//
//    @Test
//    public void testUnicodeInput() {
//        IsSubsequence ob = new IsSubsequence();
//        String s = "汉字";
//        String t = "这汉字是";
//        assertTrue(ob.isSubsequence(s, t));
//    }
//
//}