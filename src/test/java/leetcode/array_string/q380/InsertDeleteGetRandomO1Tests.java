//package leetcode.array_string.q380;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q380.InsertDeleteGetRandomO1;
//
//public class InsertDeleteGetRandomO1Tests {
//
//    // Test for inserting single element
//    @Test
//    public void testInsertSingleElement() {
//        InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
//        ob.insert(5);
//        int result = ob.getRandom();
//        assertEquals(5, result);
//    }
//
//    // Test for inserting multiple elements
//    @Test
//    public void testInsertMultipleElements() {
//        InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
//        ob.insert(1);
//        ob.insert(2);
//        int result1 = ob.getRandom();
//        int result2 = ob.getRandom();
//        assertNotEquals(result1, result2);
//    }
//
//    // Test for inserting duplicate elements
//    @Test
//    public void testInsertDuplicateElements() {
//        InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
//        ob.insert(1);
//        ob.insert(1);
//        ob.insert(1);
//        ob.insert(2);
//        ob.insert(3);
//        int result = ob.getRandom();
//        assertTrue(result == 1 || result == 2 || result == 3);
//    }
//
//    // Test for deleting an existing element
//    @Test
//    public void testDeleteExistingElement() {
//        InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
//        ob.insert(1);
//        ob.delete(1);
//        assertTrue(ob.getRandom() == -1);
//    }
//
//    // Test for deleting a non-existing element
//    @Test
//    public void testDeleteNonExistingElement() {
//        InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
//        ob.insert(1);
//        ob.insert(2);
//        ob.delete(3);
//        assertEquals(2, ob.getRandom());
//    }
//
//    // Test for deleting duplicate elements
//    @Test
//    public void testDeleteDuplicateElements() {
//        InsertDeleteGetRandomO1 ob = new InsertDeleteGetRandomO1();
//        ob.insert(1);
//        ob.insert(2);
//        ob.insert(1);
//        ob.delete(1);
//        int result = ob.getRandom();
//        assertTrue(result == 1 || result == 2);
//    }
//}