package com.example.quanlikhachang;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/quanli")
public class HelloServlet extends HttpServlet {


    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Customer[] customers = {
                new Customer("Huan1", 23, "HN", "https://picsum.photos/200/300"),
                new Customer("Huan2", 24, "HN", "https://picsum.photos/200/300"),
                new Customer("Huan3", 27, "HN", "https://picsum.photos/200/300"),
                new Customer("Huan4", 29, "HN", "https://picsum.photos/200/300")
        };

        request.setAttribute("customers", customers);
        request.getRequestDispatcher("quanli.jsp").forward(request,response);


    }

    public void destroy() {
    }
}