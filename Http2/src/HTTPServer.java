import com.sun.deploy.nativesandbox.comm.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HTTPServer {
    public static class Task implements Runnable {
        private final Socket socket;

        public Task(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                //解析请求
                Request request = Request.parse(is);
                System.out.println(request);
                //处理业务

            /*String body="<h1>一切正常</h1>";
            //拼接响应
            Response response=Response.build(os);
            //发送响应
            response.println(body);
            response.flush();*/
                socket.close();
            }catch (Exception e){}
        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);
        ExecutorService pool = Executors.newFixedThreadPool(10);

        while(true){
            Socket socket = serverSocket.accept();
            pool.execute(new Task(socket));
        }
    }
}
