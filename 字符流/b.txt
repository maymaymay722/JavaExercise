import java.io.IOException;
import java.io.InputStream;
import java.io.*;
public class InputStreamDemo {
    public static void main(String[] args) {
        //创建字节输入流的对象
        InputStream in=null;

        try{
            byte[] bs=new byte[6];
            in=new FileInputStream("a.txt");
            int len=-1;
            //int r = in.read();
            while((len=in.read(bs))!=-1) {
                String s=new String(bs,0,len);
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
