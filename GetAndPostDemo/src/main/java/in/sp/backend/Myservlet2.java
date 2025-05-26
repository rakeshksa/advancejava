package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bbb")
public class Myservlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // Optional: to make output look proper
        PrintWriter out = resp.getWriter();
        
        String mysearch = req.getParameter("Search");
        out.println("<h2>GET : " + mysearch + "</h2>");
        out.println("I am in doGet() method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // Optional: to make output look proper
        PrintWriter out = resp.getWriter();
        
        String mysearch = req.getParameter("Search");
        out.println("<h2>POST : " + mysearch + "</h2>");
        out.println("I am in doPost() method");
    }
}
