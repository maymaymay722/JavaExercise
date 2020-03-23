import java.io.*;
public class CopyDemo {
    public static void main(String[] args) {
        InputStream in=null;
        OutputStream out=null;

        try{
            in=new FileInputStream("E:\\代码\\字符流\\src\\InputStreamDemo.java");
            out=new FileOutputStream("b.txt");
            byte[] bs=new byte[1024];
            int len=-1;
            while((len=in.read(bs))!=-1){
                out.write(bs,0,len);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
