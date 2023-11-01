package jc;

public class rec_reverse {

    public static void main(String args[]) {

        int[] arr = { 10, 20, 30, 40 };
        printarr(arr, 0);
        arr_inv(arr,0);
        arr_inv2(arr,3);
        
    }

    public static void printarr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printarr(arr, idx + 1);
        System.out.println();

    }
    public static void arr_inv(int []arr,int idx) {
        if(idx==arr.length) {
            return;
        }
        
        arr_inv(arr,idx+1);
      
        System.out.print(arr[idx]);
        System.out.println();
   
        
    }

    public static void arr_inv2(int []arr,int e) {
       
        if(e<0) {
            return;
        }
        System.out.println();
        System.out.print(arr[e]);
        arr_inv2(arr,e-1);
        
    }
    
    
}