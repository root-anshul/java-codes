package jc;

import java.util.Scanner;

public class array_rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] arr = { 0, 2, 4, 6 };

        for(int i= 0;i<arr.length;i++) {
            arr[i]=in.nextInt();
        }
      //  print(arr);
        reverse(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
     //   System.out.println();
    }

    public static void reverse(int arr[]) {
        int L = 0;
        int R = arr.length - 1;
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;

            L++;
            R--;

        }

    }
}
