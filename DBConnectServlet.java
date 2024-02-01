

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBConnectServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletConfig sc=getServletConfig();
		String str=sc.getInitParameter("dbdriver");
		response.getWriter().println("Data Retrived is:"+str);
		
		
		
		
int key=Integer.parseInt(sc.getInitParameter("ackey"));

response.getWriter().println("Data Retrived is:"+key);


		
		
		
		
	
		
		
		
	
	
	
	}

}
