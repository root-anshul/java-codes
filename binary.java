package jc;

import java.util.Arrays;
import java.util.Scanner;

public class binary {
static Scanner in =new Scanner (System.in);
public static void main(String[] args) {
  
    int t=in.nextInt();
    int []arr=new int [t];
    for(int i=0;i<arr.length;i++) {
        arr[i]=in.nextInt();
 
    }
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    int key =in.nextInt();
    int first=0;
    int last=t-1;
    int mid=(first+last)/2;
    while(first<=last) {
        if(arr[mid]==key) {
            System.out.println(mid+1);
            break;
        }
        else if(arr[mid]<key) {
            first=mid+1;
        }
        else if(arr[mid]>key) {
            last=mid-1;
        }
        mid = (first+last)/2;
        if(last<first) {
            System.out.println("-1");
        }
    }
   
    
    
    
    }  
}