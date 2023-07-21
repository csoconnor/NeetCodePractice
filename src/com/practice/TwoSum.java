package com.practice;

import java.util.*;

public class TwoSum {

    List<Integer> list = new ArrayList<>();

    public TwoSum() {
        this.list = new ArrayList<>();
    }

    public void add(int number) {
        this.list.add(number);
    }

    public boolean find(int value) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++){
            if(map.containsKey(value - list.get(i))){
                return true;
            }
            map.put(list.get(i), i);
        }
        return false;
    }


}
