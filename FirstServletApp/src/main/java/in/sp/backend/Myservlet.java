package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class Myservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	Enumeration<String> headerNames = req.getHeaderNames();
	while (headerNames.hasMoreElements()) {
		String header = (String) headerNames.nextElement();
		String headervalue=req.getHeader(header);
		
		out.println(header+"-"+headervalue+"\n\n");
		
	}
	}
}
