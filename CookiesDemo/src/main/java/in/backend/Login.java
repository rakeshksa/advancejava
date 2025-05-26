package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginform")
public class Login extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String myemail=request.getParameter("email1");
		String mypass=request.getParameter("pass1");
		String myrem=request.getParameter("rememberme1");
		
		if(myemail.equals("rakesh@123")&&mypass.equals("123")) {
			
			if(myrem!=null) {
				Cookie ck=new Cookie("LoginStatus","true");
				ck.setMaxAge(60*60*24*365);
				response.addCookie(ck);
			}
			
			RequestDispatcher rd=request.getRequestDispatcher("/profilepage");
			rd.include(request, response);
		}
		else {
			out.println("<h1 style='color:red'>email and password incorrect</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service(req, resp);
	}

}
