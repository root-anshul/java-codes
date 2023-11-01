package jc;

import java.util.Scanner;

public class array_bday {
static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
      int t = in.nextInt();
      int[] arr = new int[t];
      inp(arr);
      find(arr);
  }


public static int[] inp(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
    }
    return arr;
}

public static void find(int arr[]) {
    int m = in.nextInt();
for (int n = 1; n <= m; n++) {
        int a = in.nextInt();
        int k = in.nextInt();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a % arr[i] == 0) {
                cnt++;
            }
        }  if (cnt >= k) 
        
        { 
            System.out.println("Yes");     
        } 
        else {    
            System.out.println("No");        
}
        }
}
}