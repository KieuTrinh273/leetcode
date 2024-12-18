package com.example.exe_leetcode;

public class _26_remove_duplicates_from_sorted_array {
    public static void test() {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(num));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != num) {
                nums[k] = nums[i];
                k++;
                num = nums[i];
            }
        }
        return k;
    }
}
