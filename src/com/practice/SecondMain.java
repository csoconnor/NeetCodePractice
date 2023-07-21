package com.practice;

import java.util.*;

public class SecondMain {

    public static void main(String[] args) {
        // Implement your solution here

//        int[] arr = {1, 3, 6, 4, 1, 2};
//        System.out.println(solution(arr));
//
//        int[] arr2 = {-4, -2, 4, 7, 1};
//        System.out.println(solution(arr2));

        mySqrt(4);

//        isIsomorphic("bbbaaaba", "aaabbbba");

//        int[] arr = {0,1,0,3,12};
//
//        moveZeroes(arr);

        findTheDifference("ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor"
                , "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj");

    }

    public static int solution(int[] A) {
        // Implement your solution here
        int leg = A.length;
        Set<Integer> set = new HashSet<>();
        for(int el : A){
            if(el > 0){
                set.add(el);
            }
        }

        for(int i = 1; i <= leg + 1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static int mySqrt(int x) {
        if(x == 0){
            return x;
        }

        int i = 1;
        while(i <= x / i){
            if(x / i == i){
                return i;
            }
            i++;
        }
        return i-1;
    }

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for(int i = 2; i < n; i++){
            list.add(list.get(i - 1) + list.get(i - 2));
        }

        return list.get(n - 1);
    }


    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(t.charAt(i))){
                    return false;
                }
            } else {
                if(map.containsValue(t.charAt(i))){
                    return false;
                } else {
                    map.put(c, t.charAt(i));
                }
            }
        }

        return true;
    }


    public static void moveZeroes(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            if(nums[start] == 0){
                for(int i = end; i > start; i--){
                    nums[i - 1] = nums[i];
                }
                nums[end] = 0;
                end--;
            } else {
                start++;
            }
        }
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        String[] arr = s.split(" ");

        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i)) && map.containsValue(arr[i])){
                if(!map.get(pattern.charAt(i)).equals(arr[i])){
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums1){
            set.add(n);
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] ans = new int[list.size()];
        for(int j = 0; j < ans.length; j++){
            ans[j] = list.get(j);
        }

        return ans;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) <= 0){
                    return false;
                } else {
                    map.put(c, map.get(c) - 1);
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){

        }

        return 'a';
    }



}
