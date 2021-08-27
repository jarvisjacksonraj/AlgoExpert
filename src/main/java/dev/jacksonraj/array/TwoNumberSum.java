package dev.jacksonraj.array;

import java.util.*;

class TwoNumberSum {

    public static int[] twoNumberSumTwoPointer(int[] array, int targetSum) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int sum = array[start] + array[end];
            if (targetSum == sum) {
                return new int[]{array[start], array[end]};
            } else if (targetSum < sum) {
                end--;
            } else {
                start++;
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumHash(int[] array, int targetSum) {
        HashSet<Integer> hs = new HashSet<>();
        for (Integer num : array) {
            int sum = targetSum - num;
            if (hs.contains(num)) {
                return new int[]{sum, num};
            } else {
                hs.add(sum);
            }
        }
        return new int[0];
    }
}