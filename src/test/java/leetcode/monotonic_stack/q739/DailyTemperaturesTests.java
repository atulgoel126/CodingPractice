//package leetcode.monotonic_stack.q739;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.monotonic_stack.q739.DailyTemperatures;
//
//public class DailyTemperaturesTests {
//    @Test
//    public void testTemperaturesInOrder() {
//        int[] temperatures = {50, 60, 70, 80, 90};
//        int[] expected = {1, 1, 1, 1, 0};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testTemperaturesNotInOrder() {
//        int[] temperatures = {30, 20, 40, 50, 10};
//        int[] expected = {3, 2, 1, 0, 0};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testEmptyTemperatures() {
//        int[] temperatures = {};
//        int[] expected = {};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testOneTemperature() {
//        int[] temperatures = {70};
//        int[] expected = {0};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testAllTemperaturesSame() {
//        int[] temperatures = {70, 70, 70, 70, 70};
//        int[] expected = {0, 0, 0, 0, 0};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testLargeTemperatures() {
//        int[] temperatures = {100, 100, 80, 90, 75, 110, 150, 200, 175, 160, 120, 100};
//        int[] expected = {8, 3, 1, 4, 1, 2, 1, 0, 2, 1, 0, 0};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test
//    public void testNegativeTemperatures() {
//        int[] temperatures = {-10, -5, -2, 0, 5, 10};
//        int[] expected = {6, 5, 3, 2, 0, 0};
//        DailyTemperatures ob = new DailyTemperatures();
//        int[] result = ob.dailyTemperatures(temperatures);
//        assertArrayEquals(expected, result);
//    }
//
//    @Test void testNullInput() {
//        int[] temperatures = null;
//        assertThrows(NullPointerException.class, () -> {
//            DailyTemperatures ob = new DailyTemperatures();
//            ob.dailyTemperatures(temperatures);
//        });
//    }
//}