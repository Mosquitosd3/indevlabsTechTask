package technical;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MissingNumberTest {
    @Test
    public void testFindMissingNumber() {
        MissingNumber finder = new MissingNumber();

        int[] arr1 = {5, 0, 1, 3, 2};
        assertThat(finder.findMissingNumber(arr1)).isEqualTo(4);

        int[] arr2 = {7, 9, 10, 11, 12};
        assertThat(finder.findMissingNumber(arr2)).isEqualTo(8);

        int[] arr4 = {0, 1, 2, 3, 4};
        assertThat(finder.findMissingNumber(arr4)).isEqualTo(5);

        int[] arr5 = {9, 8, 7, 6, 4, 3, 2, 1, 0};
        assertThat(finder.findMissingNumber(arr5)).isEqualTo(5);
    }
}