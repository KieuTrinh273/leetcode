package com.example.exe_leetcode;

public class _169_majority_element {
    public static void test() {
        int[] num = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(num));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 2 && nums[i] == num) {
                continue;
            }
            nums[k] = nums[i];
            k++;
            if (nums[i] == num) {
                count++;
            } else {
                count = 1;
                num = nums[i];
            }
        }
        return k;
    }
}
