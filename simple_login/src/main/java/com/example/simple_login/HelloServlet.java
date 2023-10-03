package com.example.simple_login;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class HelloServlet extends HttpServlet {


    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("admin".equals(username) && "123".equals(password)){
            writer.println("<h1>Welcome " + username + " to Website </h1>");
        }else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");

    }


    public void destroy() {
    }
}