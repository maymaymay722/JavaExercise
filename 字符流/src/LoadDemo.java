import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class LoadDemo {
    public static void main(String[] args) throws IOException {
        //创建一个 Properties 对象
        Properties prop=new Properties();

        FileInputStream in=null;
        try {
            in=new FileInputStream("name.txt");
            prop.load(in);
            System.out.println(prop);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(in!=null){
                in.close();
            }
        }

        /*System.out.println(prop);
        String name1=prop.getProperty("001");
        String name2=prop.getProperty("002");
        String name3=prop.getProperty("003");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);*/
    }
}
