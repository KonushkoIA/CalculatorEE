package servlets;

import entity.User;
import storage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login", name = "login")
public class LoginServlet extends HttpServlet{

    private final InMemoryUserStorage userStorage = new InMemoryUserStorage();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //тут всё сделать остальное в методе сервиса, создать
        User byUsername = userStorage.getByUsername(username);
        if (byUsername != null){
            if (byUsername.getPassword().equals(password)){
                req.getSession().setAttribute("user", byUsername);
                resp.sendRedirect("/");
            } else {
                resp.getWriter().println("Wrong password!");
            }
        } else {
            resp.getWriter().println("User not found!");
        }
//        for (User user : InMemoryUserStorage.users) {
//
//                HttpSession session = req.getSession();
//                session.setAttribute("key", "1");
//                resp.sendRedirect("/");
//
//        }
    }
}