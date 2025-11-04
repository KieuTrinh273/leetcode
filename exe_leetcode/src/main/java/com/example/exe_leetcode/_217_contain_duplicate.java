package com.example.exe_leetcode;

import java.util.HashSet;
import java.util.Set;

public class _217_contain_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
