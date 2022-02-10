package servlets;

import service.PutUserIntoSessionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login", name = "login")
public class LoginServlet extends HttpServlet{


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PutUserIntoSessionService puss = new PutUserIntoSessionService();
        puss.check(req, resp);
    }
}