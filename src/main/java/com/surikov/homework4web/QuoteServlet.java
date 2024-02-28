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

    private final String quoteLinus = "Bad programmers worry about the code. Good programmers worry about data structures and their relationships";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("quote",quoteLinus);
        req.getServletContext().getRequestDispatcher("/quote.jsp").forward(req,resp);
    }
}
