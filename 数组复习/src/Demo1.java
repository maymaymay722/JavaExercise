import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] newArr=Arrays.copyOf(arr,arr.length);
        System.out.println("newArr："+Arrays.toString(newArr));

        arr[0]=10;
        System.out.println("Arr："+Arrays.toString(arr));
        //copyOf 是将数组进行了 深拷贝, 即又创建了一个数组对象,
        // 拷贝原有 数组中的所有元素到新数组中.
        // 因此, 修改原数组, 不会影响到新数组
        System.out.println("newArr："+Arrays.toString(newArr));

    }

    public static int[] copyOf(int[] arr){
        int[] ret=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i]=arr[i];
        }
        return ret;
    }

}
