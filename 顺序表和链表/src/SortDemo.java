import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int[] arr={2,4,7,9,32,11,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] a={1,3,5,6,7,9,11,19};
        int i=binarySearch(a,7);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int key) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(key<arr[mid]){
                right=mid-1;
            }else if(key>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }


    private static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            for (int end = arr.length-1; end > bound; end--) {
                if(arr[end-1]>arr[end]){
                    int tmp=arr[end-1];
                    arr[end-1]=arr[end];
                    arr[end]=tmp;
                }
            }
        }
    }
}
