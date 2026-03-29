package com.foodApp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.*;

@WebServlet("/addToCart")   // ✅ VERY IMPORTANT
public class AddToCartServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String item = req.getParameter("item");

        HttpSession session = req.getSession();

        List<String> cart = (List<String>) session.getAttribute("cart");

        if(cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(item);

        session.setAttribute("cart", cart);

        res.sendRedirect("menu.jsp");
    }
}