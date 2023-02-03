import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userColorChoice = req.getParameter("colorChoice");
        req.setAttribute("colorChoice",userColorChoice);
        req.getRequestDispatcher("WEB-INF/viewColor.jsp").forward(req, resp);
    }
}
