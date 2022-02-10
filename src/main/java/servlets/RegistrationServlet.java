package servlets;

import entity.User;
import repository.userOperations.AddUser;
import service.UsernameVerificationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registration", name = "registration")
public class RegistrationServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UsernameVerificationService uvs = new UsernameVerificationService();
        if (!uvs.checkUsername(username)){
            resp.getWriter().write("A user with the same name already exists");
        } else {
        User user = new User(name, username, password);
            AddUser addUser = new AddUser();
            addUser.addUser(user);
        resp.sendRedirect("/");
        }
    }
}