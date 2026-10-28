
const { squaresOfNumbersInAnArrayInAscendingOrder } = require("./squareArrays");

describe("SquareArrays", () => {
     test("an array of numbers returns squares in ascending order", () => {
        const numbers = [3, 2, 7, 1, 4];
        const actualValue = squaresOfNumbersInAnArrayInAscendingOrder(numbers);
        const expectedValue = [1, 4, 9, 16, 49];
        expect(actualValue).toEqual(expectedValue);
    });

    test("duplicate numbers return duplicate squares", () => {
        const numbers = [2, 2, 1];
        const actualValue = squaresOfNumbersInAnArrayInAscendingOrder(numbers);
        const expectedValue = [1, 4, 4];
        expect(actualValue).toEqual(expectedValue);
    });

    test("negative numbers return positive squares in ascending order", () => {
        const numbers = [-3, -1, 2];
        const actualValue = squaresOfNumbersInAnArrayInAscendingOrder(numbers);
        const expectedValue = [1, 4, 9];
        expect(actualValue).toEqual(expectedValue);
    });

    test("null array throws an exception", () => {
        const numbers = null;
        expect(() => squaresOfNumbersInAnArrayInAscendingOrder(numbers)).toThrow(Error);
    });
});