package jc;

import java.util.Scanner;

public class blacnk {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arr1 = new int[n];
    int[] diff = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        arr1[i] = sc.nextInt();
        if (arr[i] > arr1[i]) {
            diff[i] = Math.abs(arr[i] - arr1[i]);
        } else {
            diff[i] = Math.abs(arr[i] - arr1[i]);
        }
    }
    int max =Integer.MIN_VALUE;
    int index = 0;
    for (int i = 0; i < diff.length; i++) {
        if (max < diff[i]) {
            max = diff[i];
        }
    }
    if (arr[index] > arr1[index]) {
        System.out.println("1 " + diff[index]);
    }
    else {
        System.out.println("2 " + diff[index]);
    }
}
}