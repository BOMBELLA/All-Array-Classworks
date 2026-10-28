package Functions;

import java.util.Arrays;

public class SquareArrays {

    public static int[] squaresOfNumbersInAnArrayInAscendingOrder(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int[] squares = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            squares[index] = Math.multiplyExact(numbers[index], numbers[index]);
        }
        Arrays.sort(squares);
        return squares;
    }
}