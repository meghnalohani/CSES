package Basics;

public class Search {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        //find pivot 


    }
    public static void binarySearch(int[] arr, int pivot, int key){
        int l=0;
        int r=arr.length;
        while(l<=r){
            int mid = (r-l)/2;
            if(arr[mid]==key){
                System.out.println("Found at position"+mid);
            }
            if(arr[mid]<key){
                r=mid+1;
            } else {
                l=mid-1;
            }
        }
    }
    
}
