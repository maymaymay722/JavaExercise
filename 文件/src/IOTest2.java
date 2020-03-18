import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest2 {
    public static void main(String[] args) {
        File file=new File("test.txt");
        //Writer writer=new FileWriter(file);
        //IO流是需要关闭的

        Writer writer=null;
        try{
            writer=new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                writer.write("HelloWorld;");
                if(i%10==0){
                    writer.flush();
                }
            }

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
