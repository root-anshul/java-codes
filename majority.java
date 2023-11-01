package jc;

import java.util.Scanner;

public class majority {
public static void main(String[] args) {
   Scanner in =new Scanner (System.in);
   int t=in.nextInt();
   int []arr=new int[t];   
   for(int i=0;i<arr.length;i++) {
       arr[i]=in.nextInt();
   }
   majority(arr,t);
}
   public static void majority(int []arr,int t) {
       int maxcount=0;
       int index= -1;
  
       for(int i=0;i<arr.length;i++) {
           int count =0;
           for(int j=0;j<arr.length;j++) {
               if(arr[i]==arr[j]) {
                   count++;
               }
           }
           if(count>maxcount) {
               maxcount=count;
               index=i;
           }
           
       
       }
   
       if(maxcount>t/2) {
           System.out.println(arr[index]);
       }
   }
   
}

