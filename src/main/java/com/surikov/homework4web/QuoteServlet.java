package com.surikov.homework4web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "quote", value = "/quote")
public class QuoteServlet extends HttpServlet {

    String quoteLinus = "Bad programmers worry about the code. Good programmers worry about data structures and their relationships";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("quote",quoteLinus);
        session.getServletContext().getRequestDispatcher("/quote.jsp").forward(req,resp);
    }
}
