import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int min = 1;
        int max = 3;
        String usersGuess = req.getParameter("guess");
        String correctAnswer = String.valueOf((int)Math.floor(Math.random()*(max-min+1)+min));
        System.out.println(usersGuess);
        System.out.println(correctAnswer);
        if(usersGuess.equals(correctAnswer)){
            resp.sendRedirect("/correct");
        }
        else{
            resp.sendRedirect("/incorrect");        }
    }
}
