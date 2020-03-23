import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        //创建一个 Properties 对象
        Properties prop=new Properties();
        //存储键值对
        prop.setProperty("001","mei");
        prop.setProperty("002","yingying");
        prop.setProperty("003","yingying");
        PrintWriter pw=null;
        try {
            pw=new PrintWriter("name.txt");
            prop.list(pw);
            pw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(pw!=null){
                pw.close();
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
