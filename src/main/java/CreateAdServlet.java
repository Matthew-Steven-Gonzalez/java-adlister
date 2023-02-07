import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/ads/create.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getProductsDao();
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        int userId  = Integer.parseInt(req.getParameter("userId"));
        int catId = Integer.parseInt(req.getParameter("catId"));
        Ad ad = new Ad(name,description,userId,catId);
        adsDao.insert(ad);
        resp.sendRedirect("/ads");
    }
}
