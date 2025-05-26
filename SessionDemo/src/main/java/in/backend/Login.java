package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/mylogin")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email1");
		String pass=req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		if(email.equals("rakesh@gmail.com")&&pass.equals("123")) {
			
			String name="Rakesh kumar Sahoo";//will be retrive from database
			
			HttpSession session=req.getSession();
			session.setAttribute("session_name", name);
			
			RequestDispatcher rd=req.getRequestDispatcher("/userprofile");
			rd.forward(req, resp);
		}
		else {
			out.println("<h1 style='color:red'>email and password incorrect</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
	}

}
