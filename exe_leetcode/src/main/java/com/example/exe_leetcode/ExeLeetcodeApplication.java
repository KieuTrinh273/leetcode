package com.example.exe_leetcode;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.exe_leetcode._217_contain_duplicate.containsDuplicate;

@SpringBootApplication
public class ExeLeetcodeApplication {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        //{-1, -2, -1, 0, -1, 2}
        System.out.println(containsDuplicate(nums));
    }

}
