package servlets;

import entity.User;
import repository.userOperations.UpdateUserPasswordByUsername;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/changePassword")
public class ChangePasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getServletContext().getRequestDispatcher("/pages/changePassword.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String password = req.getParameter("password");
        User user = (User) req.getSession().getAttribute("user");
        UpdateUserPasswordByUsername userByUsername = new UpdateUserPasswordByUsername();
        userByUsername.updateUserPasswordByUsername(user.getUsername(),password);
        resp.sendRedirect("/");
    }
}
