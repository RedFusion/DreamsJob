package ru.menkin;

import ru.menkin.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Menkin
 * @since 3.12.2016
 * EchoServlet
 */
public class EchoServlet extends HttpServlet {
    /**
     * users list
     */
    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("1", "one"));
        users.add(new User("2", "two"));
        users.add(new User("3", "three"));
    }

    @Override
    protected final void doGet(final HttpServletRequest req,final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String value = req.getParameter("list");
        if (value != null && value.equals("users")) {
            resp.getWriter().write(String.format("<body>echo get %s<br></body>", users));
        }
        resp.getWriter().write(
                "<form method='post'> " +
                        "<input type='text' name='id' placeHolder='id' autocomplete='off' /> <br> " +
                        "<input type='text' name='name' placeHolder='name' autocomplete='off' /> <br> " +
                        "<button name='add'>Add User</button>" +
                        "</form>");
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        users.add(new User(id, name));
        doGet(req, resp);
    }

    @Override
    protected void doPut(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<body>echo put %s<br></body>");
    }

    @Override
    protected void doDelete(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<body>echo delete %s<br></body>");
    }
}
