package leetcode.recursion_with_strings.q93;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.recursion_with_strings.q93.RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddressesTests {

    // Helper function to check if two lists of strings are equal
    private boolean equalLists(List<String> list1, List<String> list2){
        if(list1 == null && list2 == null){
            return true;
        }
        if((list1 == null && list2!= null) || (list1 != null && list2 == null) || (list1.size() != list2.size())){
            return false;
        }

        return list1.toString().contentEquals(list2.toString());
    }

    @Test
    public void testValidIPList() {
        RestoreIPAddresses ob = new RestoreIPAddresses();
        List<String> result = ob.restoreIpAddresses("25525511135");
        List<String> expected = new ArrayList<>();
        expected.add("255.255.11.135");
        expected.add("255.255.111.35");
        assertTrue(equalLists(result, expected));
    }

    @Test
    public void testInvalidIPList() {
        RestoreIPAddresses ob = new RestoreIPAddresses();
        List<String> result = ob.restoreIpAddresses("99999999999");
        List<String> expected = new ArrayList<>();
        assertFalse(equalLists(result, expected));
    }

    @Test
    public void testNullInput() {
        RestoreIPAddresses ob = new RestoreIPAddresses();
        List<String> result = ob.restoreIpAddresses(null);
        assertNull(result);
    }

    @Test
    public void testEmptyInput() {
        RestoreIPAddresses ob = new RestoreIPAddresses();
        List<String> result = ob.restoreIpAddresses("");
        List<String> expected = new ArrayList<>();
        assertTrue(equalLists(result, expected));
    }

    @Test
    public void testIPWithLeadingZeros() {
        RestoreIPAddresses ob = new RestoreIPAddresses();
        List<String> result = ob.restoreIpAddresses("0240275");
        List<String> expected = new ArrayList<>();
        expected.add("0.24.0.275");
        expected.add("0.240.27.5");
        expected.add("02.4.0.275");
        expected.add("02.40.2.75");
        expected.add("02.40.27.5");
        assertTrue(equalLists(result, expected));
    }

    @Test
    public void testInvalidInput() {
        RestoreIPAddresses ob = new RestoreIPAddresses();
        List<String> result = ob.restoreIpAddresses("aabba");
        assertNull(result);
    }

}