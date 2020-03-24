import java.util.*;
public class Demo0 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        //System.out.println(Arrays.toString(arr));
        System.out.println(toStirng(arr));

    }

    public static String toStirng(int[] arr){
        String ret="[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if(i !=arr.length-1){
                ret +=",";
            }
        }
        ret +="]";
        return ret;
    }
}
