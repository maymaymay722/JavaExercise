public class ParseRequestDemo {
    public static void main(String[] args) {
        StringBuilder request=new StringBuilder();
        request.append("GET / HTTP/1.1\r\n");
        request.append("Host: 127.0.0.1\r\n");
        request.append("Accept: text/html\r\n");
        request.append("X-Teacher：mm\r\n");
        request.append("\r\n");
        // 方法 String
        // 路径 String
        // 版本 String
        // 请求头 Map<String,String>
        String req=request.toString();
        int i=req.indexOf("\r\n");
        String requestLine=req.substring(0,i);
        String[] group=requestLine.split(" ");
        System.out.println(group[0]);
        System.out.println(group[1]);
        System.out.println(group[2]);

        while (true){
            int j=req.indexOf("\r\n",i+2);
            String line=req.substring(i+2,j);
            if (line.isEmpty()){
                break;
            }
            System.out.println(line);
            String[] kv=line.split(":");
            System.out.println("|"+kv[0].trim()+"|");
            System.out.println("|"+kv[1].trim()+"|");
            i=j;
        }
    }
}
