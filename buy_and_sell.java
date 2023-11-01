package jc;

import java.util.Scanner;

public class buy_and_sell {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t =in.nextInt();
    int arr[]=new int[t];
    for(int i=0;i<arr.length;i++) {
        arr[i]=in.nextInt();
    }
 
  
    int min=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            int num=0;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]-arr[i]>min) {
                    num=arr[j]-arr[i];
                }
                System.out.println(num);
            }
         
        }
    
   
    
    
}
}