package servlets;

import entity.Operation;
import entity.User;
import repository.actionsOfOperations.AddOperation;
import service.CalculatingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calculation", name = "calculation")
public class CalculationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getServletContext().getRequestDispatcher("/pages/calculation.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");
        Double number1 = Double.parseDouble(num1);
        Double number2 = Double.parseDouble(num2);
        double response = CalculatingService.calculating(number1,number2,operation);
        resp.getWriter().format("%.2f",response);
        Operation operation1 = new Operation(response);
        User user = (User) req.getSession().getAttribute("user");
        AddOperation addOperation = new AddOperation();
        addOperation.addOperation(operation1, user);
    }
}
