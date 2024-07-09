package leetcode.hashmap.q49;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

public class GroupAnagramsTests {
    @Test
    public void testGroupAnagrams() {
    	//basic test case
    	String[] words1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
    	List<List<String>> expected1 = new ArrayList<List<String>>();
    	expected1.add(Arrays.asList("eat","tea","ate"));
    	expected1.add(Arrays.asList("tan","nat"));
    	expected1.add(Arrays.asList("bat"));
    	
    	List<List<String>> actual1 = GroupAnagrams.groupAnagrams(words1);
    	assertEquals(expected1, actual1);
    	
    	//empty input
    	String[] words2 = {};
    	List<List<String>> expected2 = new ArrayList<List<String>>();
    	List<List<String>> actual2 = GroupAnagrams.groupAnagrams(words2);
    	assertEquals(expected2, actual2);
    	
    	//single word input
    	String[] words3 = {"a"};
    	List<List<String>> expected3 = new ArrayList<List<String>>();
    	expected3.add(Arrays.asList("a"));
    	
    	List<List<String>> actual3 = GroupAnagrams.groupAnagrams(words3);
    	assertEquals(expected3, actual3);
    	
    	//input with multiple anagrams of the same word
    	String[] words4 = {"ate", "tea", "eat", "tan", "nat", "bat", "tab", "bta"};
    	List<List<String>> expected4 = new ArrayList<List<String>>();
    	expected4.add(Arrays.asList("ate","tea","eat"));
    	expected4.add(Arrays.asList("tan","nat"));
    	expected4.add(Arrays.asList("bat"));
    	expected4.add(Arrays.asList("tab","bta"));
    	
    	List<List<String>> actual4 = GroupAnagrams.groupAnagrams(words4);
    	assertEquals(expected4, actual4);
    	
    	//input with special characters and numbers
    	String[] words5 = {"$eat", " t ea", "tan89", "ate!", "_nat", "bat%/2"};
    	List<List<String>> expected5 = new ArrayList<List<String>>();
    	expected5.add(Arrays.asList("$eat"," t ea","ate!"));
    	expected5.add(Arrays.asList("tan89","_nat"));
    	expected5.add(Arrays.asList("bat%/2"));
    	
    	List<List<String>> actual5 = GroupAnagrams.groupAnagrams(words5);
    	assertEquals(expected5, actual5);
    	
    	//input with only special characters and numbers
    	String[] words6 = {"$eat@", "!@$!", "=[]#", "$%&"};
    	List<List<String>> expected6 = new ArrayList<List<String>>();
    	expected6.add(Arrays.asList("$eat@","!@$!"));
    	expected6.add(Arrays.asList("=[]#","$%&"));
    	
    	List<List<String>> actual6 = GroupAnagrams.groupAnagrams(words6);
    	assertEquals(expected6, actual6);
    	
    	//input with multiple words of different lengths
    	String[] words7 = {"race", "care", "miles", "slim", "arc", "mile"};
    	List<List<String>> expected7 = new ArrayList<List<String>>();
    	expected7.add(Arrays.asList("race","care","arc"));
    	expected7.add(Arrays.asList("miles","mile"));
    	expected7.add(Arrays.asList("slim"));
    	
    	List<List<String>> actual7 = GroupAnagrams.groupAnagrams(words7);
    	assertEquals(expected7, actual7);
    	
    	//input with duplicate words
    	String[] words8 = {"eat", "tan", "bat", "tan", "nat", "bat", "eat", "teen"};
    	List<List<String>> expected8 = new ArrayList<List<String>>();
    	expected8.add(Arrays.asList("eat","tan"));
    	expected8.add(Arrays.asList("bat"));
    	expected8.add(Arrays.asList("nat"));
    	expected8.add(Arrays.asList("teen"));
    	
    	List<List<String>> actual8 = GroupAnagrams.groupAnagrams(words8);
    	assertEquals(expected8, actual8);
    	
    	//input with null elements
    	String[] words9 = {"eat", null, "tan", "bat", null, "nat", "bat", "eat"};
    	List<List<String>> expected9 = new ArrayList<List<String>>();
    	expected9.add(Arrays.asList("eat"));
    	expected9.add(Arrays.asList("tan"));
    	expected9.add(Arrays.asList("bat","tab"));
    	expected9.add(Arrays.asList("nat"));
    	
    	List<List<String>> actual9 = GroupAnagrams.groupAnagrams(words9);
    	assertEquals(expected9, actual9);
    	
    	//input with long words and large number of elements
    	String[] words10 = {"supercalifragilisticexpialidocious", "pneumonoultramicroscopicsilicovolcanoconiosis", "refrigerator", "antidisestablishmentarianism", "pseudopseudohypoparathyroidism", "floccinaucinihilipilification", "paraskavedekatriaphobia", "sesquipedalian", "adenosinetriphosphatase"};
    	List<List<String>> expected10 = new ArrayList<List<String>>();
    	expected10.add(Arrays.asList("supercalifragilisticexpialidocious"));
    	expected10.add(Arrays.asList("pneumonoultramicroscopicsilicovolcanoconiosis"));
    	expected10.add(Arrays.asList("refrigerator"));
    	expected10.add(Arrays.asList("antidisestablishmentarianism"));
    	expected10.add(Arrays.asList("pseudopseudohypoparathyroidism"));
    	expected10.add(Arrays.asList("floccinaucinihilipilification"));
    	expected10.add(Arrays.asList("paraskavedekatriaphobia"));
    	expected10.add(Arrays.asList("sesquipedalian"));
    	expected10.add(Arrays.asList("adenosinetriphosphatase"));
    	
    	List<List<String>> actual10 = GroupAnagrams.groupAnagrams(words10);
    	assertEquals(expected10, actual10);
    	
    }
    
    
    @Test
    public void testNullInput() {
    	//input with null array
    	String[] words1 = null;
    	try {
    		List<List<String>> actual1 = GroupAnagrams.groupAnagrams(words1);
    		fail("Expected NullPointerException");
    	} catch (NullPointerException e) {
    		//test passed
    	}
    	
    	//input with null element in array
    	String[] words2 = {"eat", null, "tan", "bat", "nat", "bat", "eat"};
    	List<List<String>> expected2 = new ArrayList<List<String>>();
    	expected2.add(Arrays.asList("eat"));
    	expected2.add(Arrays.asList("tan"));
    	expected2.add(Arrays.asList("bat","tab"));
    	expected2.add(Arrays.asList("nat"));
    	
    	List<List<String>> actual2 = GroupAnagrams.groupAnagrams(words2);
    	assertEquals(expected2, actual2);
    	
    	//input with all null elements
    	String[] words3 = {null, null, null};
    	List<List<String>> expected3 = new ArrayList<List<String>>();
    	List<List<String>> actual3 = GroupAnagrams.groupAnagrams(words3);
    	assertEquals(expected3, actual3);
    }
    
    
    @Test
    public void testEmptyInput() {
    	//input with empty array
    	String[] words1 = {};
    	List<List<String>> expected1 = new ArrayList<List<String>>();
    	List<List<String>> actual1 = GroupAnagrams.groupAnagrams(words1);
    	assertEquals(expected1, actual1);
    	
    	//input with empty strings
    	String[] words2 = {"", ""};
    	List<List<String>> expected2 = new ArrayList<List<String>>();
    	expected2.add(Arrays.asList(""));
    	List<List<String>> actual2 = GroupAnagrams.groupAnagrams(words2);
    	assertEquals(expected2, actual2);
    }
    
    
    @Test
    public void testDuplicateInput() {
    	//duplicate input with only one anagram
    	String[] words1 = {"eat", "eat", "eat", "eat"};
    	List<List<String>> expected1 = new ArrayList<List<String>>();
    	expected1.add(Arrays.asList("eat","eat","eat","eat"));
    	List<List<String>> actual1 = GroupAnagrams.groupAnagrams(words1);
    	assertEquals(expected1, actual1);
    	
    	//duplicate input with multiple anagrams 
    	String[] words2 = {"cat", "bat", "cat", "tab", "bat"};
    	List<List<String>> expected2 = new ArrayList<List<String>>();
    	expected2.add(Arrays.asList("cat","cat"));
    	expected2.add(Arrays.asList("bat","tab"));
    	List<List<String>> actual2 = GroupAnagrams.groupAnagrams(words2);
    	assertEquals(expected2, actual2);
    	
    	//input with only duplicate words
    	String[] words3 = {"cat", "cat", "cat"};
    	List<List<String>> expected3 = new ArrayList<List<String>>();
    	expected3.add(Arrays.asList("cat","cat","cat"));
    	List<List<String>> actual3 = GroupAnagrams.groupAnagrams(words3);
    	assertEquals(expected3, actual3);
    }
    
    
    @Test
    public void testInvalidInput() {
    	//input with non-alphabet characters
    	String[] words1 = {"!@#$", "%^&*", "()_+", "<>?/"};
    	List<List<String>> expected1 = new ArrayList<List<String>>();
    	expected1.add(Arrays.asList("!@#$"));
    	expected1.add(Arrays.asList("%^&*"));
    	expected1.add(Arrays.asList("()_+"));
    	expected1.add(Arrays.asList("<>?/"));
    	List<List<String>> actual1 = GroupAnagrams.groupAnagrams(words1);
    	assertEquals(expected1, actual1);
    	
    	//input with empty strings and non-alphabet characters
    	String[] words2 = {"", "!@#$", "%^&*", "", "()_+", "<>?/","",""};
    	List<List<String>> expected2 = new ArrayList<List<String>>();
    	expected2.add(Arrays.asList("",""));
    	expected2.add(Arrays.asList("!@#$"));
    	expected2.add(Arrays.asList("%^&*"));
    	expected2.add(Arrays.asList("()_+", "", ""));
    	expected2.add(Arrays.asList("<>?/"));
    	List<List<String>> actual2 = GroupAnagrams.groupAnagrams(words2);
    	assertEquals(expected2, actual2);
    	
    	//input with only non-alphabet characters
    	String[] words3 = {"!@#(","*&^%", ")(8", "<>?_"};
    	List<List<String>> expected3 = new ArrayList<List<String>>();
    	expected3.add(Arrays.asList("!@#(","*&^%", ")(8", "<>?_"));
    	
    	List<List<String>> actual3 = GroupAnagrams.groupAnagrams(words3);
    	assertEquals(expected3, actual3);
    }
}