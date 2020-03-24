import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur-1]>arr[cur]){
                    int tmp=arr[cur-1];
                    arr[cur-1]=arr[cur];
                    arr[cur]=tmp;
                }
            }
        }

    }

}
