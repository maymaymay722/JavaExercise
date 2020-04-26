import java.util.Scanner;

public class Solution04 {
    /*public static int result(int[] A,int n){
        int count=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }*/
    
    public static int result(int[] a,int n){
       if(a ==null && n==0){
           return 0;
       }
       return mergeSortRecursion(a,0,n-1);
    }

    private static int mergeSortRecursion(int[] a, int l, int r) {
        if(l==r){
            return 0;
        }
        int mid=(l+r)/2;
        //逆序对的总数 = 左边数组中的逆序对的数量 + 右边数组中逆序对的数量 + 左右结合成新的顺序数组时中出现的逆序对的数量
        return mergeSortRecursion(a,1,mid)+mergeSortRecursion(a,mid+1,r)+merge(a,1,mid,r);
    }

    private static int merge(int[] a, int left, int mid, int right) {
        int[] temp=new int[right-left+1];
        int index=0;
        int i=left;
        int j=mid+1;
        int count=0;
        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[index++]=a[i++];
            }else{
                count +=(mid-i+1);
                temp[index++]=a[j++];
            }
        }
        while(i<=mid){
            temp[index++]=a[i++];
        }
        while(j<=right){
            temp[index++]=a[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            a[left++]=temp[k];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        result(a,n);
    }
}
