import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        //创建字节输出流
        OutputStream out=null;

        try {
            byte[] bs={99,102,103};
            //out=new FileOutputStream(new File("a.txt"));
            out=new FileOutputStream("a.txt");
            //字节流不需要flush
            //out.write(98);
            out.write(bs);
            out.write(bs,1,2);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(out!=null){
                try {
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
