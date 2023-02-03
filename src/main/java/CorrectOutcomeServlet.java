import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CorrectOutcomeServlet", urlPatterns = "/correct")
public class CorrectOutcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("guess","Congratulations , You're right.");
        req.getRequestDispatcher("WEB-INF/outcome.jsp").forward(req, resp);
    }
}
