package com.sda.pl.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletToServlet {

    @WebServlet(name="RandomJson", urlPatterns = {"/getRandomNumber", "/RandomJson"})
    public class RandomJson extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse
                response) throws IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("jestes tu gdzie chciales byc");
        }
    }

}
