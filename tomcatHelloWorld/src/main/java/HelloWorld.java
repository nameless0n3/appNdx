import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World We Are Moving!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World Here We Gooo Woohooo!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}