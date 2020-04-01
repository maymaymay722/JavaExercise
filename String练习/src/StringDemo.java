public class StringDemo {
    public static void main(String[] args) {
        String str="HelloWorld!!!";

        char[] data=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        System.out.println(new String(data));
        System.out.println(new String(data,5,5));


        String str2="123as234";
        boolean result=isNum(str2);
        System.out.println(result);

        String str3="helloworld";
        byte[] bytes=str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(data[i]+" ");
        }

        System.out.println(new String(data));
    }

    private static boolean isNum(String str2) {
        char[] data=str2.toCharArray();
        for (int i = 0; i < str2.length(); i++) {
            if(data[i]<'0' || data[i]>'9'){
                return false;
            }
        }
        return true;

    }


}
