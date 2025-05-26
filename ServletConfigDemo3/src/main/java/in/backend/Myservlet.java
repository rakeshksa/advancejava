package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/myservlet"},
	initParams = {
			@WebInitParam(name="name",value="amit"),
			@WebInitParam(name="email",value="amit@123"),
			@WebInitParam(name="city",value="bengaluru")
	         }
		)
public class Myservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				PrintWriter out =resp.getWriter();
				
				resp.setContentType("text/html");
		
				ServletConfig config=getServletConfig();
				String name = config.getInitParameter("name");
				String email = config.getInitParameter("email");
				
				out.println("name :"+name+"<br>");
				out.println("email :"+email+"<br>");
	}

}
