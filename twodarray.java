package jc_code;
import java.util.Arrays;
import java.util.Scanner;
public class twodarray {
public static void main(String []agrs) {
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	int [][]arr=new int[n][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=in.nextInt();
		}
	}
	for(int[] i:arr) {
		System.out.println(Arrays.toString(i));
	}
	
}
}
