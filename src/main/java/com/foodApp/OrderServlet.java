package com.foodApp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        HttpSession session = req.getSession();
        session.removeAttribute("cart");

        res.getWriter().println("<h2>🎉 Order Placed Successfully!</h2>");
    }
}