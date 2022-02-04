package servlets;

import storage.InMemoryOperationStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/story")
public class StoryServlet extends HttpServlet {
    private InMemoryOperationStorage operationStorage = new InMemoryOperationStorage();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//       for (String operation : operationStorage.getStory()) {
//           req.setAttribute("items", operation);
//       }
        req.setAttribute("items", operationStorage.getStory());
       req.getServletContext().getRequestDispatcher("/pages/story.jsp").forward(req,resp);
    }
}

