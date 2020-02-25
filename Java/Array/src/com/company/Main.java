package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int [] arr = new int []{1,2,3,4,5};
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {
            for (int n = 0; n < num; n++) {
                // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
                int buffer = arr[0];
                arr[0] = arr[arr.length - 1];

                // циклично сдвигаем весь массив
                for (int j = 1; j < arr.length - 1; j++) {
                    arr[arr.length - j] = arr[arr.length - j - 1];
                }

                // ставим буферный элемент в 1 ячейку
                arr[1] = buffer;
            }
        }
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
