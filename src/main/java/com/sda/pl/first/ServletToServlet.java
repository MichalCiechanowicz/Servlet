package com.sda.pl.first;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;


@WebServlet(name = "ServletToServlet", urlPatterns = {"/servletToServlet"})
public class ServletToServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(ServletToServlet.class.getSimpleName());
    private static final String EXPECTED_VALUE = "true";
    private static final String PARAMETER = "giveRandomNumber";
    private static final String SERVER_ADDRESS = "http://localhost:8080/servlets/RandomJson";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String giveRandomNumber = request.getParameter(PARAMETER);
        PrintWriter out = response.getWriter();

        if (EXPECTED_VALUE.equals(giveRandomNumber)) {
            out.println("<h1>" + getRandomNumber() + "</h1>");
        } else {
            out.println("jestes tu gdzie chciales byc");
        }
    }

    private String getRandomNumber() throws IOException {
        URL url = new URL(SERVER_ADDRESS);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        connection.connect();
        logger.info("Response code" + connection.getResponseCode());
        String line = new BufferedReader(new InputStreamReader
                (connection.getInputStream()))
                .readLine();
        return line;
    }
}

