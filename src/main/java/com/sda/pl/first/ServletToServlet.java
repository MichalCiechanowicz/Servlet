package com.sda.pl.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ServletToServlet", urlPatterns = {"/servletToServlet"})
public class ServletToServlet extends HttpServlet {

    private static final String EXPECTED_VALUE = "true";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String parametr = request.getParameter("random");
        if(EXPECTED_VALUE.equals(parametr)){

        }else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("jestes tu gdzie chciales byc");
        }
    }
}

