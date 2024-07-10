package leetcode.array_string.q169;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MajorityElementTests {
	
	private MajorityElement majorityElement;

    @BeforeEach
    void setUp() throws Exception {
    	majorityElement = new MajorityElement();
    }

    @AfterEach
    void tearDown() throws Exception {
    	majorityElement = null;
    }

    @Test
    void testSingleElementArray(){
    	int[] nums = {1};
    	assertEquals(1, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testEvenLengthArray(){
    	int[] nums = {2,2,4,3,1,1};
    	assertEquals(2, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testOddLengthArray(){
    	int[] nums = {2,4,4,2,2,4,4};
    	assertEquals(4, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testEmptyArray(){
    	int[] nums = {};
    	assertEquals(-1, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testArrayWithNoMajorityElement(){
    	int[] nums = {1,2,3,4,5};
    	assertEquals(-1, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testArrayWithNegativeElements(){
    	int[] nums = {-10,0,-4,-4,-4,-4,-8,-8,-8,-8,-8};
    	assertEquals(-8, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testArrayWithDuplicateMajorityElements(){
    	int[] nums = {1,4,4,4,2,4};
    	assertEquals(4, majorityElement.majorityElement(nums));
    }
    
    @Test
    void testArrayWithLargeInput(){
    	int[] nums = new int[10000000];
    	Arrays.fill(nums, 1);
    	nums[5000000] = 2;
    	assertEquals(1, majorityElement.majorityElement(nums));
    }
    
//    @Test
//    void testArrayWithFloatInput(){
//    	int[] nums = {-1,0,0,0,1.5,10,-3.2,2,2,2};
//    	assertEquals(2, majorityElement.majorityElement(nums));
//    }
    
//    @Test
//    void testArrayWithNullElements(){
//    	int[] nums = {1,2,3,null};
//    	assertThrows(NullPointerException.class, () -> majorityElement.majorityElement(nums));
//    }

}