package com.example.exe_leetcode;

public class _55_jump_game {
    public static void test() {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int lastStep = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= lastStep - i) {
                lastStep = i;
            }
        }
        return lastStep == 0;
    }
}
