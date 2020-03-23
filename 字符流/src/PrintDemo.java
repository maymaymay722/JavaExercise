import java.io.*;

public class PrintDemo {
    public static void main(String[] args) {
        PrintWriter pw=null;
        BufferedReader br=null;

        try {
            br=new BufferedReader(new FileReader("e.txt"));
            pw=new PrintWriter(System.out);
            String line=null;
            while((line=br.readLine()) !=null){
                pw.println(line);
                pw.flush();
            }

//            pw.print(1);
//            pw.print(1.1);
//            pw.print("liangliang");
//            pw.print('c');

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(pw!=null){
                pw.close();
            }
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
