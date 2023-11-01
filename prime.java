package jc;


import java.util.Scanner;
public class prime {
public static void main (String agrs[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int i=2;
    int flag=0;
    while(n>i) {
        if(n%i==0) {
            flag++;
            break;
        }      
               
        i++;
    }
    if(flag==0) {
        System.out.println("prime");
    }
    else {
        System.out.println("not Prime");
    }
    
}
}
