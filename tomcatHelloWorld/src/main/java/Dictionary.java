import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Dictionary extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ConcurrentHashMap<String, String> paths = new ConcurrentHashMap<>();
	
	public Dictionary()
	{
        paths.put("fig1","<img src='fig1.gif' width='353' height='171'/>");
        paths.put("eq1", "<img src='eq1.gif'  width='197' height='90'/>");
        paths.put("eq2", "<img src='eq2.gif'  width='212' height='93'/>");
        paths.put("eq3", "<img src='eq3.gif'  width='493' height='160'/>");
        paths.put("eq4", "<img src='eq4.gif'  width='577' height='171'/>");
        paths.put("eq5", "<img src='eq5.gif'  width='525' height='194'/>");
        paths.put("eq6", "<img src='eq6.gif'  width='542' height='149'/>");
        paths.put("eq7", "<img src='eq7.gif'  width='413' height='66'/>");
        paths.put("eq8", "<img src='eq8.gif'  width='424' height='274'/>");		
	}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	String id = request.getParameter("id");    	
    	String returnedPath = paths.getOrDefault(id, "Not found");
    	//response.get
    	response.setContentType("application/json");
    	response.getWriter().write(returnedPath);
    	/****************/
        /*sresponse.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Dictionary We Are Moving!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dictionary Here We Gooo Woohooo!</h1>");
        out.println("</body>");
        out.println("</html>");*/
    }
}