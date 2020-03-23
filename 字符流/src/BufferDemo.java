import java.io.*;
public class BufferDemo {
    public static void main(String[] args) {
        BufferedInputStream in=null;
        BufferedOutputStream out=null;

        try {
            in=new BufferedInputStream(new FileInputStream("E:\\代码\\字符流\\src\\OutputStreamDemo.java"));
            out=new BufferedOutputStream(new FileOutputStream("c.txt"));
            byte[] bs=new byte[1024];
            int len=-1;
            while((len=in.read(bs))!=-1){
                out.write(bs,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
