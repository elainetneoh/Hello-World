package com.myapp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(description = "This is the main controller", urlPatterns = { "/hello" })
public class MainController extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        String uname = "";
        if (request.getParameter("uname") != null) {
            uname = request.getParameter("uname");
        }
        final String message = "Hello Dear" + uname + " Congratulations! You have succesfully logging in! ";
        request.setAttribute("message", (Object)message);
        request.getRequestDispatcher("/Welcome.jsp").forward((ServletRequest)request, (ServletResponse)response);
    }
    
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
