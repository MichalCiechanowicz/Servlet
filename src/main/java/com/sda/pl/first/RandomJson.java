package com.sda.pl.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="RandomJson", urlPatterns = {"/getRandomNumber", "/RandomJson"})
public class RandomJson extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        double random = Math.random();
        out.println(random);
    }
}
