//package leetcode.graph_algorithms.q210;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.graph_algorithms.q210.CourseScheduleII;
//
//public class CourseScheduleIITests {
//    @Test
//    public void testValidSchedule() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing a valid schedule with 4 courses
//        int[][] prerequisites1 = {{1,0},{2,1},{3,2}};
//        int[] expected1 = {0,1,2,3};
//        int[] result1 = ob.findOrder(4, prerequisites1);
//        assertArrayEquals(expected1, result1, "Valid schedule with 4 courses was not returned correctly.");
//
//        // Testing a valid schedule with 2 courses
//        int[][] prerequisites2 = {{1,0}};
//        int[] expected2 = {0,1};
//        int[] result2 = ob.findOrder(2, prerequisites2);
//        assertArrayEquals(expected2, result2, "Valid schedule with 2 courses was not returned correctly.");
//    }
//
//    @Test
//    public void testInvalidSchedule() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing an invalid schedule with 3 courses (cycle present)
//        int[][] prerequisites1 = {{1,0},{2,1},{0,2}};
//        int[] expected1 = {};
//        int[] result1 = ob.findOrder(3, prerequisites1);
//        assertArrayEquals(expected1, result1, "Invalid schedule with cycle present was not returned correctly.");
//
//        // Testing an invalid schedule with 2 courses (course with no prerequisites)
//        int[][] prerequisites2 = {{1,0},{0,2}};
//        int[] expected2 = {};
//        int[] result2 = ob.findOrder(2, prerequisites2);
//        assertArrayEquals(expected2, result2, "Invalid schedule with a course that has no prerequisites was not returned correctly.");
//    }
//
//    @Test
//    public void testNoPrerequisites() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing a schedule with no prerequisites
//        int[][] prerequisites = {};
//        int[] expected = {0,1,2};
//        int[] result = ob.findOrder(3, prerequisites);
//        assertArrayEquals(expected, result, "Schedule with no prerequisites was not returned correctly.");
//    }
//
//    @Test
//    public void testSameCourses() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing a schedule with multiple occurrences of the same course
//        int[][] prerequisites = {{1,0},{2,1},{1,2}};
//        int[] expected = {};
//        int[] result = ob.findOrder(3, prerequisites);
//        assertArrayEquals(expected, result, "Schedule with multiple occurrences of the same course was not returned correctly.");
//    }
//
//    @Test
//    public void testLargeInput() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing a schedule with a large number of courses (1000 courses)
//        int[][] prerequisites = new int[1000][2];
//        for (int i = 1; i < 1000; i++) {
//            prerequisites[i][0] = i;
//            prerequisites[i][1] = i - 1;
//        }
//        int[] expected = new int[1000];
//        for (int i = 0; i < 1000; i++) {
//            expected[i] = i;
//        }
//        int[] result = ob.findOrder(1000, prerequisites);
//        assertArrayEquals(expected, result, "Schedule with a large number of courses was not returned correctly.");
//    }
//
//    @Test
//    public void testInputWithNullPrerequisites() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing input with null prerequisites
//        int[][] prerequisites = null;
//        int[] expected = {0,1,2};
//        int[] result = ob.findOrder(3, prerequisites);
//        assertArrayEquals(expected, result, "Input with null prerequisites was not handled correctly.");
//    }
//
//    @Test
//    public void testEmptyInput() {
//        CourseScheduleII ob = new CourseScheduleII();
//
//        // Testing empty input
//        int[][] prerequisites = {};
//        int[] expected = {};
//        int[] result = ob.findOrder(0, prerequisites);
//        assertArrayEquals(expected, result, "Empty input was not handled correctly.");
//    }
//}