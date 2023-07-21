package com.practice;

import java.util.Arrays;

public class SlidingWindow {

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while(right < prices.length){
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return maxProfit;
    }

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        int right = 0;

        int[] map = new int[256];
        Arrays.fill(map, -1);
        while(right < s.length()) {
            if (map[s.charAt(right)] != -1) {
                left = Math.max(map[s.charAt(right)] + 1, left);
            }
            map[s.charAt(right)] = right;
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
