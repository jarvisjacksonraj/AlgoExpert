package dev.jacksonraj.array;

import java.util.*;

public class ValidateSubsequence {

    //O(n) time | O(1) space - where n is the length of the array
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            if (sequence.size() > seqIndex && array.get(i) == sequence.get(seqIndex)) {
                seqIndex++;
            }
        }
        return seqIndex == sequence.size();
    }


}
