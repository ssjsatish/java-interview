package hackerpalm.arrays;

import com.hackerpalm.arrays.ArrayDuplicateChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayDuplicateCheckerTest {

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {1, 2, 3, 2};
        assertTrue(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testArrayWithoutDuplicates() {
        int[] arr = {1, 2, 3, 4,78,9};
        assertFalse(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testDuplicateAtBeginning() {
        int[] arr = {5, 5, 2, 3};
        assertTrue(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testDuplicateAtEnd() {
        int[] arr = {1, 2, 3, 3};
        assertTrue(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testDuplicateInMiddle() {
        int[] arr = {1, 9, 9, 3};
        assertTrue(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testAllSameValues() {
        int[] arr = {7, 7, 7, 7};
        assertTrue(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testNegativeAndPositiveNumbers() {
        int[] arr = {-1, 5, -1, 3};
        assertTrue(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {10};
        assertFalse(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertFalse(ArrayDuplicateChecker.hasDuplicate(arr));
    }

    @Test
    void testNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayDuplicateChecker.hasDuplicate(null));
    }
}
