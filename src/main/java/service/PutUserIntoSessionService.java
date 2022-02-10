package service;

import entity.User;
import repository.userOperations.SelectUserByUsername;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PutUserIntoSessionService {

    public void check(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        SelectUserByUsername userByUsername = new SelectUserByUsername();
        User user = userByUsername.selectUserByUsername(username);
        if (user != null){
            if (user.getPassword().equals(password)){
                req.getSession().setAttribute("user", user);
                resp.sendRedirect("/");
            } else {
                resp.getWriter().println("Wrong password!");
            }
        } else {
            resp.getWriter().println("User not found!");
        }
    }
}
