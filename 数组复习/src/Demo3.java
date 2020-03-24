public class Demo3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(avg(arr));

    }

    public static double avg(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return (double)sum/(double)arr.length;
    }

}
