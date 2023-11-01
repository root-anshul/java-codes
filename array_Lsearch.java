package jc;

import java.util.Scanner;

public class array_Lsearch {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    int arr[]=new int[t] ;
    for(int i =0; i<arr.length;i++) {
        arr[i]=in.nextInt();
      }
    int num=in.nextInt();
    int key=linear(arr,num);
    System.out.println(key);
    
}

public static int linear(int[]arr,int num) {
    for(int i=0;i<arr.length;i++) {
        if(num==arr[i]) {
            return i;
        }
       
    }
    return -1;
}

}