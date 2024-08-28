package org.example;

public class Lab028 {
    public static void main(String[] args) {
        int arr [] = {34, 23, 45, 35};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

            int sal [] = {90, 80, 70, 60, 50};
            System.out.println(sal.length);
            for (int i1 = 0; i1 < sal.length; i1++) {
                System.out.println("double the salary:"+ sal[i1]*2);

            }

        }
    }
}
