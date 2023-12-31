package com.practice;

import java.util.HashSet;
import java.util.Set;

//This is a demo task.
// Write a function: class Solution { public int solution(int[] A); } that, given an array A of N integers,
// returns the smallest positive integer (greater than 0) that does not occur in A.
// For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
// Given A = [1, 2, 3], the function should return 4. Given A = [−1, −3], the function should return 1.
// Write an efficient algorithm for the following assumptions:
// N is an integer within the range [1..100,000];
// each element of array A is an integer within the range [−1,000,000..1,000,000].
public class ThirdMain {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 4, 1, 2};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {-1, -3};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));

    }

    public static int solution(int[] A){
        Set<Integer> set  = new HashSet<>();

        for(int n : A){
            if(n > 0){
                set.add(n);
            }
        }

        for(int i = 1; i <= A.length + 1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
