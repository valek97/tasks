package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int [] myArr= new int [] {1,2,1,2,1,3,2,3,4,4,4,4};
        int pairs = 0;
        int count = 0;
        int color =1;
        /*for (int i =0; i < myArr.length-1; i++){

            if (myArr[i]== color) {
                count++;


                if (i == myArr.length - 1) {
                    count = count % 2;
                    for (int j = 0; j < count; j++) {
                        pairs++;
                    }
                    count = 0;
                }
            }
            color++;
            System.out.println(pairs);
        }*/
        Set<Integer> colors = new HashSet<>();
        for (int i = 0; i < myArr.length; i++) {
            if (!colors.contains(myArr[i])) {
                colors.add(myArr[i]);
            } else {
                pairs++;
                colors.remove(myArr[i]);
            }
        }
        System.out.println(pairs);
    }
}
