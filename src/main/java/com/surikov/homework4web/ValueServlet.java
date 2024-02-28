package com.surikov.homework4web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Objects;

@WebServlet(name="calculateValueServlet", value = "/calculatevalue")
public class ValueServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] numsString = req.getParameterValues("num");
        String select = req.getParameter("radioSelect");
        int[] numsInt = numsInt = new int[numsString.length];;
        Service service = new Service();
        int calculateValue = 0;

                if(select == null) {
                    select = "Result";
                }

                for(int i=0;i<numsString.length;i++){
                    if(numsString[i].isEmpty()){
                        numsInt[i] = 0;
                    } else {
                        numsInt[i] = Integer.parseInt(numsString[i]);
                    }

                    req.setAttribute("num"+i,numsInt[i]);
                }

                switch(select){
                    case "MAX":
                        calculateValue = service.getMax(numsInt);
                        break;
                    case "MIN":
                        calculateValue = service.getMin(numsInt);
                        break;
                    case "AVG":
                        calculateValue = service.getAvg(numsInt);
                        break;
                }

                req.setAttribute("calculateValue",calculateValue);
                req.setAttribute("checkBoxValue",select);
                req.getServletContext().getRequestDispatcher("/calculatevalue.jsp").forward(req,resp);



    }
}
