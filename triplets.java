package jc;

import java.util.Scanner;

public class triplets { 
static Scanner  in = new Scanner (System.in);
public static void main(String[] args) {

int t= in.nextInt();
int []arr=new int [t];
sort(arr);
triple(arr);
}

  public static void sort(int []arr) {
      for(int i=0;i<arr.length;i++) {
          arr[i]=in.nextInt();
      }
       for(int i=0;i<arr.length;i++) {
          for(int j=i;j<arr.length;j++) {
              if(arr[i]>arr[j]) {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              } 
         }
      
       }
       for(int i=0;i<arr.length;i++) {
           System.out.print(arr[i]+" ");
       } 
  }
    public static void triple(int []arr) {
       int num =in.nextInt();
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                for(int k=i+2;k<arr.length;k++) {
                    if( arr[i]+arr[j]+arr[k]==num && arr[i]!=arr[j]&&arr[j]!=arr[k] && arr[j]<=arr[k]){
                      
                          System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    }   
                    
                   
            }
        }
   
        }
                      
}
}














