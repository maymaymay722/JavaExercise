import java.io.*;

public class Jar {
    //jar -cvf Main.jar A.class B.class
    public static void main(String[] args) throws FileNotFoundException {
        args[0]="-cvf";
        args[1]="Main.jar";
        args[2]="A.class";
        args[3]="B.class";

        //String 解析 -cvf
        OutputStream os=new FileOutputStream(args[0]);
        InputStream is1=new FileInputStream(args[1]);
        InputStream is2=new FileInputStream(args[2]);
        InputStream is3=new FileInputStream(args[3]);
    }
}
