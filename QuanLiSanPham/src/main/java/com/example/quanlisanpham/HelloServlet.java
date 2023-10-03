package com.example.quanlisanpham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "")
public class HelloServlet extends HttpServlet {
    private static ArrayList<Product> list ;

    public void init() {
       list = new ArrayList<>();
       list.add(new Product("Iphone 12","25.000.000","https://cdn-v2.didongviet.vn/files/media/catalog/product/i/p/iphone-12-mau-green-didongviet_2_1.jpg"));
       list.add(new Product("Iphone 13","28.500.000","https://www.techone.vn/wp-content/uploads/2021/09/xanh.jpg"));
       list.add(new Product("Iphone 14","30.000.000","https://www.techone.vn/wp-content/uploads/2022/09/14-prm-vang-1.jpg"));
       list.add(new Product("Iphone 15","35.000.000","https://www.techone.vn/wp-content/uploads/2023/09/iphone-15-pro-max_7__1.webp"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
     HttpSession session = request.getSession();
     session.setAttribute("list",list);

     response.sendRedirect("listProduct.jsp");
    }

    public void destroy() {
    }
}