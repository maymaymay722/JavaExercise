import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Request {
    String method;
    String path;
    String version;
    Map<String, String> headers = new HashMap<>();

    public static Request parse(InputStream is) {
        Request request = new Request();
        Scanner scanner = new Scanner(is, "UTF-8");
        // 1. 解析请求行
        parseRequestLine(request,scanner.nextLine());
        // 2. 解析请求头直到空行
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            String[] group = line.split(":");
            String key = group[0].trim();
            String value = group[1].trim();
            request.headers.put(key, value);
        }
        //3. 解析正文(忽略)

        return request;
    }

    private static void parseRequestLine(Request request,String line) {
        String[] group = line.split(" ");
        request.method = group[0];
        request.path = group[1];
        request.version = group[2];
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
