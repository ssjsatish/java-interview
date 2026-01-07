package hackerpalm.arrays;

import com.hackerpalm.arrays.MaxElementFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MaxElementFinderTest {

    @Test
    public void testNormalArray() {
        int[] arr = {3, 8, 2, 10, 5};
        assertEquals(10, MaxElementFinder.findMax(arr));
    }

    @Test
    public void testMaxAtBeginning() {
        int[] arr = {20, 5, 6, 7};
        assertEquals(20, MaxElementFinder.findMax(arr));
    }

    @Test
    void testMaxAtEnd() {
        int[] arr = {3, 4, 9, 15};
        assertEquals(15, MaxElementFinder.findMax(arr));
    }

    @Test
    void testMaxInMiddle() {
        int[] arr = {3, 25, 4, 10};
        assertEquals(25, MaxElementFinder.findMax(arr));
    }

    @Test
    void testAllNegativeNumbers() {
        int[] arr = {-5, -9, -2, -11};
        assertEquals(-2, MaxElementFinder.findMax(arr));
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {7};
        assertEquals(7, MaxElementFinder.findMax(arr));
    }

    @Test
    void testDuplicateMaxValues() {
        int[] arr = {4, 9, 9, 2, 9};
        assertEquals(9, MaxElementFinder.findMax(arr));
    }

    @Test
    void testSortedAscendingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, MaxElementFinder.findMax(arr));
    }

    @Test
    void testSortedDescendingArray() {
        int[] arr = {10, 8, 6, 2};
        assertEquals(10, MaxElementFinder.findMax(arr));
    }

    @Test
    void testEmptyArrayThrowsException() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> MaxElementFinder.findMax(arr));
    }

    @Test
    void testNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MaxElementFinder.findMax(null));
    }
}

