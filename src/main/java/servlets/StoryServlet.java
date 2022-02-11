package servlets;

import entity.Operation;
import entity.User;
import repository.actionsOfOperations.SelectAllUserOperations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/story")
public class StoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        User user = (User) req.getSession().getAttribute("user");
        int userId = user.getId();
        SelectAllUserOperations allUserOperations = new SelectAllUserOperations();
        List<Operation> operationList = allUserOperations.selectAllUserOperations(userId);
        req.setAttribute("items", operationList);
       req.getServletContext().getRequestDispatcher("/pages/story.jsp").forward(req,resp);
    }
}

