package service;

import entity.User;
import storage.InMemoryUserStorage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PutUserIntoSessionService {

    private final InMemoryUserStorage userStorage = new InMemoryUserStorage();

    public void check(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
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
    }
}
