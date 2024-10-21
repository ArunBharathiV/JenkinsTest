package com.omrjenkins.baseclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String str= "Apple, Orange, Apple, Kiwi, Mango";
        String[] strArray = str.split(", ");
        List<String> fruitList = new ArrayList<>();
        for(int i = 0; i < strArray.length; i++){
            fruitList.add(strArray[i]);
        }
        Set<String> setFr= new HashSet<String>();
        setFr.addAll(fruitList);
        System.out.println(setFr);
    }
}