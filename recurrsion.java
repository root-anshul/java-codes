package jc;
import java.util.Scanner;
public class recurrsion {
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt() ;
    System.out.println(fact(n));
}
public static int fact(int n) {
    if(n==0) {
        return 1;
    }
int sp=fact(n-1);
return sp*n;
    
    
}

}
