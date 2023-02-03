import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IncorrectOutcomeServlet", urlPatterns = "/incorrect")
public class IncorrectOutcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("guess","Sorry, You're wrong.");
        req.getRequestDispatcher("WEB-INF/outcome.jsp").forward(req, resp);
    }
}
