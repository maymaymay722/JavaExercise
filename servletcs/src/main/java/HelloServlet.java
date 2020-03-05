// 导入必需的 java 库
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 扩展 HttpServlet 类
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        /*
        删除 cookie
         */
        Cookie cookie = null;
        Cookie[] cookies = null;
// 获取与该域相关的 Cookies 的数组
        cookies = request.getCookies();
// 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String title = "Delete Cookies Example";
        String docType =
                "<!doctype html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n" );
        if( cookies != null ){
            out.println("<h2>Cookies 名称和值</h2>");
            for (int i = 0; i < cookies.length; i++){
                cookie = cookies[i];
                if((cookie.getName( )).compareTo("first_name") == 0 ) {
                    cookie.setMaxAge(0); //将过期时间设置为0，删除指定cookie
                    response.addCookie(cookie);
                    out.print("已删除的 cookie：" +
                            cookie.getName( ) + "<br/>");
                }
                out.print("名称：" + cookie.getName( ) + "，");
                out.print("值：" + cookie.getValue( )+" <br/>");
            }
        }
        out.println("</body>");
        out.println("</html>");
        /*
        获取写入的cookie
        Cookie cookie = null;
        Cookie[] cookies = null;
        // 获取与该域相关的 Cookies 的数组
        cookies = request.getCookies();

        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String title = "Reading Cookies Example";
        String docType = "<!doctype html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n" );

        if( cookies != null ){
            out.println("<h2>查找 Cookies 名称和值</h2>");
            for (int i = 0; i < cookies.length; i++){
                cookie = cookies[i];
                out.print("名称：" + cookie.getName( ) + "，");
                out.print("值：" + cookie.getValue( )+" <br/>");
            }
        }
        out.println("</body>");
        out.println("</html>");
        */

        /*
        一、提交表单，设置 cookie
        // 为名字和姓氏创建 Cookies
        Cookie firstName = new Cookie("first_name",request.getParameter("first_name"));
        Cookie lastName = new Cookie("last_name",request.getParameter("last_name"));

        // 为两个 Cookies 设置过期日期为 24 小时后
        firstName.setMaxAge(60*60*24);
        lastName.setMaxAge(60*60*24);

        // 在响应头中添加两个 Cookies
        response.addCookie( firstName );
        response.addCookie( lastName );

        // 设置响应内容类型
        response.setContentType("text/html");
        // 设置响应的编码格式
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String title = "设置 Cookies 实例";
        String docType = "<!doctype html public>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                " <li><b>名字</b>："
                + request.getParameter("first_name") + "\n" +
                " <li><b>姓氏</b>："
                + request.getParameter("last_name") + "\n" +
                "</ul>\n" +
                "</body></html>");
          */
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        doGet(request,response);
    }
}