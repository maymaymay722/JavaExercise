import java.util.Arrays;

public class Demo8 {
    // 数组逆置
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            arr[left]=arr[left]^arr[right];
            arr[right]=arr[left]^arr[right];
            arr[left]=arr[left]^arr[right];

            //int tmp = arr[left];
            //arr[left] = arr[right];
            //arr[right] = tmp;
            left++;
            right--;
        }

    }
}
