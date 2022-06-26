package com.weijian.learn.learnservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ip")
public class Ip extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Path Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.printf("%s<br>", req.getServerName());
        out.printf("%s<br>", req.getQueryString());
        out.printf("%s<br>", req.getHeader("Date"));
        out.print("</body>");
        out.print("</html>");
    }
}
