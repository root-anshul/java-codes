package jc;

import java.util.Scanner;

public class array_01 {
public static void main(String[] args) {
String str="the sky is blue";
String str1="abcd";
rev(str);

sub(str1);
}    

public static void rev(String str) {
    while(true) {
    int i = str.lastIndexOf(" ");
    String word= str.substring(i+1);
    System.out.print(word+" ");
    if(i==-1) {
        break;
    }
    str= str.substring(0,i);
    }
    System.out.println();
System.out.println("========");
}
public static void sub(String str) {
    for(int s=0;s<str.length();s++) {
        for(int e=s+1;e<=str.length();e++) {
            System.out.println(str.substring(s,e));
        }
    }
}


}
