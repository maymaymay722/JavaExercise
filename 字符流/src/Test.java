import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str=new String("中");
        byte[] gbks=str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
    }
}
