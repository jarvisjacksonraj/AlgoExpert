package dev.jacksonraj.array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import dev.jacksonraj.array.TwoNumberSum;
import org.junit.Test;

public class TestTwoNumberSum {
    @Test
    public void twoNumberSumTwoPointerTest() {
        int[] result = TwoNumberSum.twoNumberSumTwoPointer(new int[] { 2,7,11,15},9);
        assertArrayEquals(result,new int[] { 2,7});
    }

    @Test
    public void twoNumberSumHashTest() {
        int[] result = TwoNumberSum.twoNumberSumHash(new int[] { 3,7,11,15},10);
        assertArrayEquals(result,new int[] { 3,7});
    }
}
