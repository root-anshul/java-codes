package jc_code;

public class reverse_num {
	public static void main(String []args) {
		int n=12345;
		int rem=0;
		int sum=0;
		 while(n>0) {
	    rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		
	}
		 System.out.println(sum);

	}
	
}
