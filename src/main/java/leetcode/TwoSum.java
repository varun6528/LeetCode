package main.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

// nums -> 2, 7, 11, 15
// target -> 9
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        HashMap<Integer, Integer> toSumMap = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
            if(toSumMap.containsKey(nums[i])) {
                results[0] = toSumMap.get(nums[i]);
                results[1] = i;
            } else {
                toSumMap.put(target - nums[i], i);
            }
        }
        System.out.println("Result"+ Arrays.toString(results));
        return results;
    }
}
