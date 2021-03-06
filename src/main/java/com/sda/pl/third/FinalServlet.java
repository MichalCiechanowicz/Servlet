package com.sda.pl.third;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static com.sda.pl.third.ForwardParam.REDIRECT_PARAMETER;

@WebServlet("/finalServlet")
public class FinalServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        String attributeValue = (String) request.getAttribute(REDIRECT_PARAMETER);
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        writer.println("<h> Hello, " + attributeValue + "!</h>");
    }

}
