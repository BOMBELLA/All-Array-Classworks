
import Functions.SquareArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareArraysTest {

    @Test
    public void testThatAnArrayOfNumbersReturnsSquaresInAscendingOrder() {
        int[] numbers = {3, 2, 7, 1, 4};
        int[] actualValue = SquareArrays.squaresOfNumbersInAnArrayInAscendingOrder(numbers);
        int[] expectedValue = {1, 4, 9, 16, 49};
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void testThatDuplicateNumbersReturnsDuplicateSquares() {
        int[] numbers = {2, 2, 1};
        int[] actualValue = SquareArrays.squaresOfNumbersInAnArrayInAscendingOrder(numbers);
        int[] expectedValue = {1, 4, 4};
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    public void testThatNegativeNumbersReturnPositiveSquaresInAscendingOrder() {
        int[] numbers = {-3, -1, 2};
        int[] actualValue = SquareArrays.squaresOfNumbersInAnArrayInAscendingOrder(numbers);
        int[] expectedValue = {1, 4, 9};
        assertArrayEquals(expectedValue, actualValue);
    }
    @Test
    public void testThatNullArrayThrowsAnException() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () ->
                SquareArrays.squaresOfNumbersInAnArrayInAscendingOrder(numbers));
    }
}
