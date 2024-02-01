

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/abc",initParams = {
        @WebInitParam(name = "location", value = "banglore"),
        @WebInitParam(name = "location1", value = "Chennai"),
        
    
})
public class Sample extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	ServletConfig sc=	getServletConfig();
	String data=sc.getInitParameter("location1");
	
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter(); 
	pw.println("<h1>Hello All"+data);
	//response.getWriter().println("<font color=blue>"+data);
	//System.out.println(data);
		
		
	
	
	
	}
	
}

