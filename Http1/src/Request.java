import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Request {
    //方法
    String method;
    //路径
    String path;
    //版本
    String version;
    //请求头
    //key-value
    Map<String, String> headers = new HashMap<>();
    //正文(忽略)

    public static Request parse(InputStream is) {
        Request request = new Request();
        // is 是 字节流，不太容易读一行，用熟悉的 Scanner 处理
        Scanner scanner = new Scanner(is, "UTF-8");
        // 遵循 HTTP 请求格式
        // 1. 解析请求行
        String requestLine = scanner.nextLine();
        String[] group = requestLine.split(" ");
        request.method = group[0];
        request.path = group[1];
        request.version = group[2];
        // 2. 解析请求头直到空行
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            String[] kv = line.split(":");
            String key = kv[0].trim();
            String value = kv[1].trim();
            request.headers.put(key, value);
        }
        //3. 解析正文(忽略)

        return request;
    }

    @Override
    public String toString() {
        return "Request{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", version='" + version + '\'' +
                ", headers=" + headers +
                '}';
    }
}
