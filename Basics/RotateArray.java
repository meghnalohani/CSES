package Basics;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d=2;
        int start = 0;
        int end = arr.length-1;
        reverse(arr,0,d);
        reverse(arr, d+1, end);
        reverse(arr, start, end);
        for(int i:arr){
            System.out.println(i);
        }


    }
    public static void reverse(int[] a, int start, int end){
        int temp;
        while(start<=end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
