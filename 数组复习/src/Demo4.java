public class Demo4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(find(arr,10));

    }

    public static int find(int[] arr,int toFind){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }

}
