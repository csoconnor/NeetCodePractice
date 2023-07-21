package com.practice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        TwoSum test = new TwoSum();
//        test.add(1);
//        test.add(2);
//        test.add(5);
//        test.find(4);

        canPermutePalindrome("as");
    }



    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> res = new ArrayList();
        if(strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] hash = new int[s.length()];
            for(char c : s.toCharArray()){
                hash[c - 'a']++;
                System.out.println(hash[c]);
            }
            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }

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

    public static int search(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;

        while(i <= j){
            int mid = (i + j) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                i = mid + 1;
            } else {
                j = mid -1;
            }
        }
        return -1;
    }

//    public ListNode reverseList(ListNode head) {
//        ListNode current = head;
//        ListNode prev = null;
//
//        while(current != null){
//            ListNode next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        return prev;
//    }

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        final ListNode root = new ListNode();
//        ListNode prev = root;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                prev.next = list1;
//                list1 = list1.next;
//            } else {
//                prev.next = list2;
//                list2 = list2.next;
//            }
//            prev = prev.next;
//        }
//        prev.next = list1 != null ? list1 : list2;
//        return root.next;
//    }

//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        TreeNode node = new TreeNode(root.val);
//        node.right = invertTree(root.left);
//        node.val = root.val;
//        node.left = invertTree(root.right);
//        return node;
//    }


    public static boolean canPermutePalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        int failures = 0;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                failures++;
            }
            start++;
            end--;
        }

        return failures <= 1;
    }



}
