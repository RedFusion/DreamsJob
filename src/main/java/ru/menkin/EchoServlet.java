package ru.menkin;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class EchoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<html><body>Menkin E.A.<br></body></html>");
    }
}
