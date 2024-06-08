//find if  anumber is perfect square upto 3 precisions 
package Basics;
class BinarySearch {
    public static void main(String[] args) {
        int n = 26;
        int l=1;
        int r=n/2;
        int ans=1;
        while(l<=r){
            int mid = (l+r)/2;
            if(mid*mid<=n){
                ans=mid;
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        if(ans*ans==n){
            System.out.println(ans);
            return;
        }
        double ld = ans;
        double rd = ans + 1;
        double ans2=1.0;
        while(ld<=rd){
            double mid = (rd+ld)/2;
            if(mid*mid<=n){
                ans2 = mid;
                ld=mid+0.003;
            } else {
                rd=mid-0.003;
            }
        }
        System.out.println(ans2);
        
    }
}