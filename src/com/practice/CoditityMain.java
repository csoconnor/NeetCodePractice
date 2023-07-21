package com.practice;

import java.util.*;

public class CoditityMain {

    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 7, 6};
        System.out.println(garden(arr));

        System.out.println(binaryGap(529));

        rotate(arr, 3);

        for(int n : arr){
            System.out.println("\t" + n);
        }
    }

    public static int garden(int[] garden){
        int actions=0;
        int avg= (int)Math.ceil(Arrays.stream(garden).average().orElse(0));
        Arrays.sort(garden);
        int i=garden.length-1;
        int j=garden.length-1;

        while(j>=0 && i>=0){
            if(garden[j]>=avg){

                j--;
            }else if(garden[i]>avg){

                int needTrees=avg-garden[j];
                int bigPart=garden[i]-avg;
                int addTrees=needTrees>=bigPart?bigPart:needTrees;
                garden[i]=garden[i]-addTrees;
                garden[j]=garden[j]+addTrees;
                actions=actions+addTrees;

            }else{
                i--;
            }
        }
        for(int k = 0 ;k<garden.length-1;k++){
            if(garden[k]!=avg){

                actions=actions+Math.abs(avg-garden[k]);
                garden[k]=avg;
            }
        }

        return actions;
    }

    public static int binaryGap(int N){
        String binary = Integer.toBinaryString(N);
        int max = 0;
        int curr = 0;
        int start = 0;

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                start = i;
                break;
            }
        }

        for(int i = start; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                if(curr > max){
                    max = curr;
                }
                curr = 0;
            } else {
                curr++;
            }
        }

        return max;
    }

    public static void rotate(int[] nums, int k) {
        System.out.println("remainder k: " + k % nums.length);
        while(k > 0){
            nums = shiftByOne(nums);
            k--;
        }
    }

    public static int[] shiftByOne(int[] n){
        int lastEl = n[n.length - 1];

        for(int i = n.length - 1; i > 0; i--){
            n[i] = n[i-1];
        }

        n[0] = lastEl;

        return n;
    }

    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();

            for(int n : arr){
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            for(Map.Entry<Integer, Integer> e : map.entrySet()){
                if(set.contains(e.getValue())){
                    return false;
                } else {
                    set.add(e.getValue());
                }
            }

            return true;



        }
    }

    public String reverseWords(String s) {
        String x = "";
        for(String t : s.split(" ")){
            x += new StringBuilder(t).reverse().toString() + " ";
        }
        return x.trim();
    }

    public int reverse(int x) {
        long finalNum = 0;

        while(x != 0){
            int lastDig = x % 10;
            finalNum += lastDig;
            finalNum *= 10;
            x = x / 10;
        }
        finalNum /= 10;

        if(finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE){
            return 0;
        }

        return (int) finalNum;
    }


}
