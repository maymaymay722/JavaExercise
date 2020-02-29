import javax.servlet.ServletException;
import  javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        /*
        三、获取HTTP Request头部信息
        String title = "HTTP Header Request";
        String docType = "<!doctype html\">\n";
        out.println(docType +"<html>\n" +
                "<head><title>" + title + "</title></head>\n"+
                "<body>\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"2\" align=\"center\">\n" + "<tr>\n" +
                "<th>Header name</th><th>Header value</th>\n"+ "</tr>\n");

        Enumeration headerNames = request.getHeaderNames();//返回一个枚举，包含在该请求中包含的所有的头名。

        while(headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);//以字符串形式返回指定的请求头的值
            out.println("<td> " + paramValue + "</td></tr>\n");
        }
        out.println("</table>\n</body></html>");
         */

        /*
        二、表单
        String method = request.getMethod();
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");

        String title = "HTTP Function Test!";
        String docType = "<!doctype html>\n";
        out.println(docType + "<html>\n" +
                "<head><title>" +title+ "</title></head>\n" +
                "<body>"+
                "<h3> method: " +method+ "</h3>" +
                "<h3> first_name: " +first_name+ "</h3>" +
                "<h3> last_name: " +last_name+ "</h3>" +
                "</body>"+
                "</html>");
        */

        /*
        一、基本方法使用
        String method = request.getMethod();//返回请求的 HTTP 方法的名称
        String encoding = request.getCharacterEncoding();//返回请求主体中使用的字符编码的名称
        String url = request.getContextPath();//返回指示请求上下文的请求 URI 部分
        String contentType = request.getContentType();//返回请求主体的 MIME 类型，如果不知道 类型则返回 null


        String title = "HTTP Function Test!";
        String docType = "<!doctype html>\n";
        out.println(docType + "<html>\n" +
                "<head><title>" +title+ "</title></head>\n"
                + "<body>"+
                "<h3> Method: " +method+ "</h3>" +
                "<h3> encoding: " +encoding+ "</h3>" +
                "<h3> url: " +url+ "</h3>" +
                "<h3> contentType: " +contentType+ "</h3>" +
                "</body>"+ "</html>");
        */

        //response.setContentType("text/html");
        //response.setCharacterEncoding("UTF-8");
        //PrintWriter out = response.getWriter();
        //out.println("<h1>这是动态的内容</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
