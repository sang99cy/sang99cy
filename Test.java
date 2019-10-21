package Mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet("/Test")
public class Test extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public Test() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
			response.setContentType("text/html; charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			
			List<Users> list = Bean.ExportUsers();
			
			
			out.println("<head>");
			out.println("<title>Result</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table border = '1'>");
			out.println("<tr>");
			
			
			for (Users users: list)
			{
				out.println("<td><b>"+users.getName1()+"</b></td>");
				out.println("<td>"+users.getName2()+"</td>");
			}
			
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
	}

}
