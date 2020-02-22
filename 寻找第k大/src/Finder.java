import java.util.Scanner;

public class Finder{
    public static int findKth(int[] a, int n, int K){
        return findKth(a,0,n-1,K);
    }

    public static int findKth(int[] a,int low,int high,int k){
        int part=partation(a,low,high);

        if(k==part-low+1) {
            return a[part];
        } else if(k>part-low+1){
            return findKth(a,part+1,high,k-part+low-1);
        }else {
            return findKth(a,low,part-1,k);
        }
    }

    public static int partation(int[] a,int low,int high){
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
        System.out.println("请输入n(数组长度)：");
        int n=sc.nextInt();
        System.out.println("请输入K：");
        int K=sc.nextInt();
        System.out.println("请输入数组：");
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println(findKth(a,n,K));
    }
}