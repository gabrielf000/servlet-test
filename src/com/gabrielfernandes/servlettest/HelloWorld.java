package com.gabrielfernandes.servlettest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html>\n" +
                "<head><title>Hello WORLD</title></head>\n" +
                "<body>\n" +
                "<h1>Hello WORLD</h1>\n" +
                "</body></html>");
  }
}