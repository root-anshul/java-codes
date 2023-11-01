package jc;

import java.util.Scanner;

public class array_icecream {
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    int []arr=new int[t];
    
    for(int i=0;i<arr.length;i++) {
       arr[i]=in.nextInt();
    }
    System.out.println(min(arr));
            
}
public static int min(int [] arr) {
    int num =Integer.MAX_VALUE;
    int ind=0;
    
    for(int i=0;i<arr.length;i++) {
    if(num>arr[i]) {
        num =arr[i];
        ind =i+1;
    }
    
    }
    return ind;
}   
}