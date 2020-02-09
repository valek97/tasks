package com.company;


public class Main {

    public static void main(String[] args) {

       String s =  "Hello my is Joeseph. It is very nice to meet you. What a wonderful day it is!";
        int index = s.indexOf("is");
        int count = 0;
        while (index != -1) {
            count++;
            s = s.substring(index + 1);
            index = s.indexOf("is");
        }
        System.out.println("No of *is* in the input is : " + count);


      /*  String haystack = "Hello my is Joeseph. It is very nice to meet you. What a wonderful day it is!";
        haystack.toLowerCase();
        String needle = "is";

        int numNeedles = 0;

        int pos = haystack.indexOf(needle);

        while(pos >= 0 ){

            pos = pos + 1;
            numNeedles = numNeedles + 1;

            pos = haystack.indexOf(needle,pos);

        }

        System.out.println("the num of " +needle+ "= " +numNeedles);*/
    }
}
