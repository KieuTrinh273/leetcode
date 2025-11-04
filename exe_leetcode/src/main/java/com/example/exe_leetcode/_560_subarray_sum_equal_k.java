package com.example.exe_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _560_subarray_sum_equal_k {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int numOfSubarraySum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {

            }
        }
        return numOfSubarraySum;
    }
}
