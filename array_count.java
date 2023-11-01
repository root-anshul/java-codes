package jc;

import java.util.Scanner;

public class array_count {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t =in.nextInt();
    int []arr=new int[t];
    for(int i=0;i<arr.length;i++) {
        arr[i]=in.nextInt();
    }
    int num=in.nextInt();
    count(arr,num);
    
}
public static void count(int []arr, int num ) {
int flag=0;
for(int i=0;i<arr.length;i++) {
    if(arr[i]==num) {
        flag++;
    }
}
System.out.println(flag);

}

}
