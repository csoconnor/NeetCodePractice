package com.practice;

public class TwoPointers {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while(left < right){
            int length = right - left;
            int curr = Math.min(height[left], height[right]) * length;
            area = Math.max(curr, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }
}
