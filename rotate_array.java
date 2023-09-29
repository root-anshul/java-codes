package jc_code;

public class rotate_array {
public static void main(String[]args) {
	int k=2;
	int arr[]= {1,2,3,4,5};
				
	k=k%arr.length;
	reverse(arr,0,arr.length-1);
	reverse(arr,0,k-1);
	reverse(arr,k,arr.length-1);
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
}

public static void reverse(int[]arr,int start,int end) {
	
	while(start<=end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
}
