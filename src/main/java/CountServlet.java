import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private int count;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String resetCounter;
        try{
            resetCounter = req.getParameter("reset");
        }catch(Exception e){
            resetCounter = null;
        }
        if (resetCounter == null) {
            count += 1;
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.printf("<h1>%s</h1>", count);
        } else {
            PrintWriter out = resp.getWriter();
            out.println("<h1>The count has been reset</h1>");
            count = 0;
        }
    }
}
