package jc_code;

public class ceiling_floor {
public static void main(String []args) {
	int []arr= {2,3,5,6,7,9,14,16,18,20,22,23,24,26};
	int target=15;
	
	int ans=ceiling(arr,target);
	System.out.println(ans);
	System.out.println("===");
	;
	int ans1=floor(arr,target);
	System.out.println(ans1);
}


static int ceiling(int[]arr,int tar) {
	int start=0; 
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(tar<arr[mid]) {
			end=mid-1;
		}
		else if(tar>arr[mid]) {
			start=mid+1;
		}
		else {
			return arr[mid];
		}
		
		
	}

	return arr[start];
}
static int floor(int[]arr,int tar) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(tar<arr[mid]) {
			end=mid-1;
		}
		else if(tar>arr[mid]) {
			start=mid+1;
		}
		else {
			return arr[mid];
		}
		
		
	}

	return arr[end];
}
}
