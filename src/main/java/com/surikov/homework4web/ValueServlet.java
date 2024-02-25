package com.surikov.homework4web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="calculateValueServlet", value = "/calculatevalue")
public class ValueServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String[] numsString = req.getParameterValues("num");
        String select = req.getParameter("radioSelect");
        int[] numsInt = new int[numsString.length];
        int calculateValue;

        for(int i=0;i<numsString.length;i++){
            numsInt[i] = Integer.parseInt(numsString[i]);
            session.setAttribute("num"+i,numsInt[i]);
        }

        calculateValue = numsInt[0];

        switch(select){
            case "MAX":
                for(int i=0;i<numsInt.length;i++){
                    if(calculateValue<numsInt[i]){
                        calculateValue = numsInt[i];
                    }
                }
                break;
            case "MIN":
                for(int i=0;i<numsInt.length;i++){
                    if(calculateValue>numsInt[i]){
                        calculateValue = numsInt[i];
                    }
                }
                break;
            case "AVG":
                int sum=0;
                for(int i=0;i<numsInt.length;i++){
                    sum +=numsInt[i];
                }
                calculateValue = sum/numsInt.length;
        }

        session.setAttribute("calculateValue",calculateValue);
        session.setAttribute("checkBoxValue",select);
        session.getServletContext().getRequestDispatcher("/calculatevalue.jsp").forward(req,resp);


    }
}
