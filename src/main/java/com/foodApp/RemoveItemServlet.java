package com.foodapp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.*;

@WebServlet("/removeItem")
public class RemoveItemServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String item = req.getParameter("item");

        HttpSession session = req.getSession();

        List<String> cart = (List<String>) session.getAttribute("cart");

        if(cart != null) {
            cart.remove(item);
        }

        session.setAttribute("cart", cart);

        res.sendRedirect("cart.jsp");
    }
}