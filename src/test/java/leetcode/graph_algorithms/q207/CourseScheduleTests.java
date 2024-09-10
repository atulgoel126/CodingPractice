
package leetcode.graph_algorithms.q207;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseScheduleTests {

    private CourseSchedule courseSchedule;

    // Set up the CourseSchedule object for each test case
    @BeforeEach
    public void setUp() {
        courseSchedule = new CourseSchedule();
    }

    // Test case for a simple schedule with no dependencies
    @Test
    public void testNoDependencies() {
        int[][] schedule = {{1,0}, {2,0}, {3,0}};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertTrue(result);
    }

    // Test case for a simple schedule with dependencies that can be fulfilled
    @Test
    public void testSimpleDependencies() {
        int[][] schedule = {{1,0}, {2,1}, {3,2}};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertTrue(result);
    }

    // Test case for a simple schedule with circular dependencies
    @Test
    public void testCircularDependencies() {
        int[][] schedule = {{1,0}, {1,2}, {2,1}};
        boolean result = courseSchedule.canFinish(3, schedule);
        assertFalse(result);
    }

    // Test case for a schedule with a course that has no prerequisites
    @Test
    public void testCourseWithNoPrerequisite() {
        int[][] schedule = {{1,0}, {2,0}, {3,0}};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertTrue(result);
    }

    // Test case for a schedule with a course that is a prerequisite for all other courses
    @Test
    public void testCourseIsPrerequisiteForAll() {
        int[][] schedule = {{0,1}, {0,2}, {0,3}};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertTrue(result);
    }

    // Test case for empty schedule
    @Test
    public void testEmptySchedule() {
        int[][] schedule = {};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertTrue(result);
    }

    // Test case for a schedule with only one course
    @Test
    public void testSingleCourse() {
        int[][] schedule = {};
        boolean result = courseSchedule.canFinish(1, schedule);
        assertTrue(result);
    }

    // Test case for a schedule with duplicate courses
    @Test
    public void testDuplicateCourses() {
        int[][] schedule = {{1,0}, {1,2}, {2,1}, {2,3}};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertFalse(result);
    }

    // Test case for a schedule with a course that has itself as a prerequisite
    @Test
    public void testCourseDependsOnItself() {
        int[][] schedule = {{1,0}, {2,2}, {3,2}};
        boolean result = courseSchedule.canFinish(4, schedule);
        assertFalse(result);
    }

    // Test case for a schedule with a mix of valid and invalid dependencies
    @Test
    public void testMixedDependencies() {
        int[][] schedule = {{1,0}, {3,2}, {2,1}, {4,2}, {5,4}};
        boolean result = courseSchedule.canFinish(6, schedule);
        assertTrue(result);
    }

    // Test case for a schedule where all courses have the same prerequisite
    @Test
    public void testSamePrerequisites() {
        int[][] schedule = {{1,0}, {2,0}, {3,0}, {4,0}, {5,0}};
        boolean result = courseSchedule.canFinish(6, schedule);
        assertTrue(result);
    }

    // Test case for a schedule with a large number of courses and dependencies
    @Test
    public void testLargeSchedule() {
        int[][] schedule = new int[100000][2];
        for (int i = 0; i < 100000; i++) {
            schedule[i][0] = i+1;
            schedule[i][1] = i;
        }
        boolean result = courseSchedule.canFinish(100001, schedule);
        assertTrue(result);
    }
}