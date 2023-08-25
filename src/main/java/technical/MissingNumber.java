package technical;

import java.util.Arrays;

/**
 * A utility class to find the first missing number in an array of sequential numbers.
 */
public class MissingNumber {

    /**
     * Finds the first missing number in a sorted array of sequential numbers.
     *
     * @param arr An array of sequential numbers with one missing number.
     * @return The first missing number in the sequence.
     */
    public int findMissingNumber(int[] arr) {
        // Step 1: Sort the input array in ascending order
        Arrays.sort(arr);

        // Step 2: Initialize a variable to track the current missing number
        int missingNumber = arr[0];

        // Step 3: Iterate through the sorted array
        for (int el : arr) {
            // Step 4: Compare the current element with the expected missing number
            if (el == missingNumber) {
                // If the current element matches the expected missing number,
                // increment the missing number to the next sequential value
                missingNumber++;
            } else {
                // If the current element does not match the expected missing number,
                // it means we have found the missing number, so we break out of the loop
                break;
            }
        }

        // Step 5: Return the missing number that was found
        return missingNumber;
    }
}