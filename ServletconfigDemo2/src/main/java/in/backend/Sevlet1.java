package in.backend;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Sevlet1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		ServletConfig config=getServletConfig();
//		String name = config.getInitParameter("name1");
//		String email = config.getInitParameter("email1");
//		String city = config.getInitParameter("city");
//		
//		out.println("name :"+name+"<br>");
//		out.println("email :"+email+"<br>");
//		out.println("city :"+city+"<br>");
		
		Enumeration<String> con = config.getInitParameterNames();
		while (con.hasMoreElements()) {
			String ele =  con.nextElement();
			String paraname=config.getInitParameter(ele);
			out.println(paraname);
		}
		
	}

}
