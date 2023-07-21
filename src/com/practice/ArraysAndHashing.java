package com.practice;

import java.util.*;

public class ArraysAndHashing {

    public static void main(String[] args) {

        int[] arr = {0,1,3,50,75};
//        topKFrequent(arr, 1);

        findMissingRanges(arr, 0, 99);
    }
    public static boolean containsDuplicate(int nums[]){
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> sHash = new HashMap<>();
        HashMap<Character, Integer> tHash = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            if(sHash.containsKey(s.charAt(i))){
                sHash.put(s.charAt(i), sHash.get(s.charAt(i)) + 1);
            } else {
                sHash.put(s.charAt(i), 1);
            }

            if(tHash.containsKey(t.charAt(i))){
                tHash.put(t.charAt(i), tHash.get(t.charAt(i)) + 1);
            } else {
                tHash.put(t.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : sHash.entrySet()){
            if(!Objects.equals(entry.getValue(), tHash.get(entry.getKey()))){
                return false;
            }
        }

        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int third = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[] { hashMap.get(target - nums[i]), i };
            }
            hashMap.put(nums[i], i);
        }
        return new int[] {};
    }

//    public static int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] arr = new int[k];
//        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
//
//        for(Map.Entry<Integer, Integer> it : map.entrySet()){
//            pq.add(it);
//            if(pq.size() > k) pq.poll();
//        }
//
//        int i = k;
//        while(!pq.isEmpty()){
//            arr[--i] = pq.
//        }
//
//        return new int[]{1};
//    }
        // not O(n)
//    public int[] productExceptSelf(int[] nums) {
//        int[] arr = new int[nums.length];
//
//        for(int i = 0; i < nums.length; i++){
//            int product = 1;
//            for(int j = 0; j < nums.length; j++){
//                if(j != i){
//                    product *= nums[j];
//                }
//            }
//            arr[i] = product;
//        }
//
//        return arr;
//    }

    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int right = 1;
        int left = 1;
        for(int i = 0; i< nums.length; i++){
            output[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            output[i] *=  right;
            right *= nums[i];
        }
        return output;
    }


    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = null;
        Set<Character> colSet = null;

        for(int i = 0; i < 9; i++){
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
        }

        return true;
    }

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int ans = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> ans = new ArrayList<>();

        int curr = lower;
        for(int n : nums ){
            if(curr < n){
                ans.add(Arrays.asList(curr, n-1));
            }
            curr = n + 1;
        }

        if(curr <= upper){
            ans.add(Arrays.asList(curr, upper));
        }

        return ans;
    }



}
