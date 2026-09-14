/**
 * Roadmap problem #1: Find the maximum value in an array.
 *
 * Problem statement:
 * Given a non-empty integer array, return the largest value in the array.
 *
 * Input:
 * An integer array named numbers containing at least one value.
 *
 * Output:
 * The largest integer contained in numbers.
 *
 * Constraints:
 * - The array contains at least one integer.
 * - Values may be positive, zero, or negative.
 *
 * Sample test cases:
 * 1. Input: [3, 1, 4, 2]    Output: 4
 * 2. Input: [-5, -2, -9]    Output: -2
 * 3. Input: [7]              Output: 7
 *
 * Method signature:
 * public int findMaximum(int[] numbers)
 */
public class FindMaximumValue {
    public int findMaximum(int[] numbers) {
        throw new UnsupportedOperationException("Implement this method");
    }

    public static void main(String[] args) {
        FindMaximumValue solution = new FindMaximumValue();

        runTest(solution, new int[] {3, 1, 4, 2}, 4);
        runTest(solution, new int[] {-5, -2, -9}, -2);
        runTest(solution, new int[] {7}, 7);
    }

    private static void runTest(FindMaximumValue solution, int[] input, int expected) {
        int actual = solution.findMaximum(input);
        if (actual != expected) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
        System.out.println("PASS: expected " + expected + ", got " + actual);
    }
}