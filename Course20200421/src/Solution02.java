import java.util.Scanner;

public class Solution02{
    public static int findKth(int[] a,int n,int k){
        return findkth(a,0,n-1,k);
    }

    public static int findkth(int[] a,int low,int high,int k) {
        int part=partation(a,low,high);

        if(k==part-low+1)
            return a[part];
        else if(k>part-low+1)
            return findkth(a,part+1,high,k-part+low-1);
        else
            return findkth(a,low,part-1,k);
    }

    private static int partation(int[] a, int low, int high) {
        int key=a[low];
        while(low<high){
            while(low<high && a[high]<=key)
                high--;
            a[low]=a[high];
            while(low<high && a[low]>=key)
                low++;
            a[high]=a[low];
        }
        a[low]=key;
        return low;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=findKth(a,n,k);
        System.out.println(res);
    }
}