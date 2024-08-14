package leetcode.array_string.q238;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductofArrayExceptSelfTests {

    @Test
    public void testPositiveNumbers() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testArrayWithOneZero() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {1, 2, 3, 0};
        int[] expected = {0, 0, 0, 6};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testArrayWithMultipleZeros() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {0, 1, 2, 3, 0};
        int[] expected = {0, 0, 0, 0, 0};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testAllNegativeNumbers() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {-1, -2, -3, -4};
        int[] expected = {-24, -12, -8, -6};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testMixedPositiveAndNegativeNumbers() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {1, -2, 3, -4};
        int[] expected = {24, -12, 8, -6};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testSingleElement() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {5};
        int[] expected = {1};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testEmptyArray() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {};
        int[] expected = {};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testDuplicateNumbers() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {1, 2, 3, 2, 1};
        int[] expected = {12, 6, 4, 6, 12};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testNegativeAndZeroValues() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {-1, 0, 1, -2, 0, 2};
        int[] expected = {0, 0, 0, 0, 0, 0};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testDuplicateElementsAndZeros() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {0, 0, 1, 2, 3, 4, 0, 0, 5};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testSingleElementRepeated() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {5, 5, 5, 5};
        int[] expected = {125, 125, 125, 125};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testMixOfPositiveNegativeAndZeroValues() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {1, 2, -3, 4, 0, -5, 6, 0};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testNegativeNumbers() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {-5, 10, -15};
        int[] expected = {-150, 75, -50};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testOnlyZeroValues() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        testProductExceptSelf(ob, input, expected);
    }

    @Test
    public void testNegativeZeroValues() throws Exception {
        ProductofArrayExceptSelf ob = new ProductofArrayExceptSelf();
        int[] input = {-0, -0, -0, -0};
        int[] expected = {0, 0, 0, 0};
        testProductExceptSelf(ob, input, expected);
    }

    // Helper method to test private method
    private void testProductExceptSelf(ProductofArrayExceptSelf ob, int[] input, int[] expected) throws Exception {
        Method method = ProductofArrayExceptSelf.class.getDeclaredMethod("productExceptSelf", int[].class);
        method.setAccessible(true);
        int[] result = (int[]) method.invoke(ob, (Object) input);
        assertArrayEquals(expected, result);
    }
}
