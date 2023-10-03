package com.example.quanlisanpham;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CartServlet", value = "/cart")
public class CartServlet extends HttpServlet {
    private ArrayList<Product> list;

    @Override
    public void init() throws ServletException {
        list = new ArrayList<>();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String image = req.getParameter("image");
        System.out.println(name);
        System.out.println(price);
        System.out.println(image);
        list.add(new Product(name,price,image));
        HttpSession session = req.getSession();
        session.setAttribute("listCart",list);
        req.getRequestDispatcher("listProduct.jsp").forward(req,resp);
//        resp.sendRedirect("listProduct.jsp");
    }
}
