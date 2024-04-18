package com.servlet.servlet.basic.response;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="responseHtmlServlet", urlPatterns ="/response-html")
public class ResponseHtmlSErvlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: text/html;charset=utf-8
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("<html>");
        response.getWriter().write("<body>");
        response.getWriter().write("<div>hello</div>");
        response.getWriter().write("</body>");
        response.getWriter().write("</html>");
    }
}
