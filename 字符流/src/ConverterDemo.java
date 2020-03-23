import java.io.*;
public class ConverterDemo {
    public static void main(String[] args) {
        OutputStreamWriter ow=null;


        try {
            ow=new OutputStreamWriter(new FileOutputStream("d.txt"));
            ow.write("helloworld");
            ow.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if(ow!=null){
                    ow.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
