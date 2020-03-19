import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        //File file=new File("test.txt");

        //Writer writer=new FileWriter(file);
        //IO流是需要关闭的

        Writer writer=null;
        try{
            writer=new FileWriter("test1.txt");
            //writer=new FileWriter(file);
            writer.write("HelloWorld;");
            //writer.flush(); 如果 finally 里面没有内容，则就添加这个

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //判断 writer 不是空，防止空指针异常
            if(writer !=null){
                try{
                    // 在关闭前会做 flush 的事情
                    writer.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
