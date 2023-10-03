package com.example.javawebcurrencyconverter;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {


    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//      float rate = Float.parseFloat(request.getParameter("rate"));
//      float usd = Float.parseFloat(request.getParameter("usd"));
//
//      float vnd = rate * usd;
//
//      PrintWriter printWriter = response.getWriter();
//      printWriter.println("<html>");
//        printWriter.println("<h1>Rate: " + rate + "</h1>");
//        printWriter.println("<h1>USD: " + usd + "</h1>");
//        printWriter.println("<h1>VND: " + vnd + "</h1>");
//        printWriter.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));

        float vnd = rate * usd;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Rate: " + rate + "</h1>");
        writer.println("<h1>USD: " + usd + "</h1>");
        writer.println("<h1>VND: " + vnd + "</h1>");
        writer.println("</html>");
    }


    public void destroy() {
    }
}