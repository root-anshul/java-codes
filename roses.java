package jc;

import java.util.Arrays;
import java.util.Scanner;

public class roses {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int diff = 0, prev = 0, a = 0, b = 0;
    while(n > 0){
        int m = scn.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m;i++){
            arr[i] = scn.nextInt();
        }
        int max_price = scn.nextInt();
        for(int i = 0; i < m; i++){
            for(int j = i+1; j < m; j++){
                if(arr[i]+arr[j] == max_price){
                    a = arr[i];
                    b = arr[j];
                    prev = diff;
                    diff = Math.abs(arr[i] - arr[j]);
                    if(diff < prev){
                        a = arr[i];
                        b = arr[j];
                    }
                }
            }
        }
        if(a > b){
            System.out.println("Deepak should buy roses whose prices are "+b+" and "+a+".");
        }else{
            System.out.println("Deepak should buy roses whose prices are "+a+" and "+b+".");
        }
        n--;
    }
}
}







