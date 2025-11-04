package com.example.exe_leetcode;

import java.util.HashMap;
import java.util.Map;

public class _525_contiguous_array {
    public static int findMaxLength(int[] nums) {
        int maxLength= 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums[i] = -1;
            }
            if (i>0){
                nums[i] = nums[i]+nums[i-1];
            }
            if(map.containsKey(nums[i])){
                maxLength = Math.max(maxLength,i-map.get(nums[i]));
            }else {
                map.put(nums[i],i);
            }
        }
        return maxLength;
    }
}
