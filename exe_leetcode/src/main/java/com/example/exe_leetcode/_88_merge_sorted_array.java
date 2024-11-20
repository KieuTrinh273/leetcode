package com.example.exe_leetcode;

public class _88_merge_sorted_array {
    public static void test() {
        int[] num1 = {0};
        int[] num2 = {1};
        int m = 0;
        int n = 1;
        merge(num1, m, num2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p2] = nums2[p2];
            p2--;
        }
    }
}
