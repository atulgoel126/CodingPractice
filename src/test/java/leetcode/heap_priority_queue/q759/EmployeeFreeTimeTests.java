//package leetcode.heap_priority_queue.q759;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.heap_priority_queue.q759.EmployeeFreeTime;
//
//public class EmployeeFreeTimeTests {
//
//    // Test case for a single employee with no schedules
//    @Test
//    public void testSingleEmployeeNoSchedules() {
//        int[][][] schedule = {{{}}, {}};
//        int[][] expected = {{0, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for a single employee with one schedule
//    @Test
//    public void testSingleEmployeeOneSchedule() {
//        int[][][] schedule = {{{0, 10}}, {}};
//        int[][] expected = {{Integer.MIN_VALUE, 0}, {10, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for a single employee with multiple overlapping schedules
//    @Test
//    public void testSingleEmployeeMultipleSchedules() {
//        int[][][] schedule = {{{0, 5}, {2, 7}, {10, 15}}, {}};
//        int[][] expected = {{Integer.MIN_VALUE, 0}, {7, 10}, {15, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for multiple employees with no schedules
//    @Test
//    public void testMultipleEmployeesNoSchedules() {
//        int[][][] schedule = {{{}}, {}, {}, {}};
//        int[][] expected = {{0, Integer.MAX_VALUE}, {0, Integer.MAX_VALUE}, {0, Integer.MAX_VALUE}, {0, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for multiple employees with one schedule each
//    @Test
//    public void testMultipleEmployeesOneSchedule() {
//        int[][][] schedule = {{{0, 5}}, {{2, 7}}, {{9, 12}}, {{14, 20}}};
//        int[][] expected = {{Integer.MIN_VALUE, 0}, {5, 9}, {12, 14}, {20, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for multiple employees with multiple overlapping schedules
//    @Test
//    public void testMultipleEmployeesMultipleSchedules() {
//        int[][][] schedule = {{{0, 5}, {2, 7}, {10, 15}}, {{1, 6}, {3, 9}, {12, 18}}, {{8, 13}, {14, 20}}, {{16, 22}, {24, 30}, {26, 27}}};
//        int[][] expected = {{Integer.MIN_VALUE, 0}, {9, 10}, {15, 16}, {22, 24}, {30, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case with employee who has no free time
//    @Test
//    public void testNoFreeTime() {
//        int[][][] schedule = {{{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}, {11, 12}}, {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}, {11, 12}}};
//        int[][] expected = {{Integer.MIN_VALUE, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case with employees who have overlapping schedules but do not have any common free time
//    @Test
//    public void testNoCommonFreeTime() {
//        int[][][] schedule = {{{0, 10}, {15, 20}}, {{5, 12}, {18, 25}}, {{8, 16}, {22, 30}}, {{13, 24}, {26, 35}}};
//        int[][] expected = {{Integer.MIN_VALUE, 0}, {10, 13}, {24, 26}, {30, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Edge case with employee whose schedule spans the entire day
//    @Test
//    public void testFullDaySchedule() {
//        int[][][] schedule = {{{Integer.MIN_VALUE, Integer.MAX_VALUE}}, {}};
//        int[][] expected = {{Integer.MIN_VALUE, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for null input
//    @Test
//    public void testNullInput() {
//        int[][][] schedule = null;
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertThrows(NullPointerException.class, () -> ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for empty schedule array
//    @Test
//    public void testEmptySchedule() {
//        int[][][] schedule = {{{}}, {}};
//        int[][] expected = {{0, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertArrayEquals(expected, ob.employeeFreeTime(schedule));
//    }
//
//    // Test case for invalid schedule where end time is before start time
//    @Test
//    public void testInvalidSchedule() {
//        int[][][] schedule = {{{2, 1}}, {}};
//        int[][] expected = {{0, Integer.MAX_VALUE}};
//        EmployeeFreeTime ob = new EmployeeFreeTime();
//        assertThrows(IllegalArgumentException.class, () -> ob.employeeFreeTime(schedule));
//    }
//}