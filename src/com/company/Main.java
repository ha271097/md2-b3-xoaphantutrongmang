package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa :");
        int x = sc.nextInt();
        int newArry[] = deleteValue(x);
        System.out.println("new arry : ");
        newarray(newArry);

    }
    public static int[] deleteValue(int x) {
        int arry[] = {1, 3, 5, 7, 9};
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == x) {
                arry[i] = 0;
            }
        }
        for (int j = 0; j < arry.length-1; j++) {
            int temp;
            if (arry[j] == 0) {
                temp = arry[j +1];
                arry[j+1] = arry [j];
                arry[j] = temp;
            }
        }
        return arry;
    }
    public static void newarray(int [] array){
        for(int a: array){
            System.out.println(a);
        }
    }
}

