import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/pizzaOrder.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String address = req.getParameter("address");
        System.out.printf("Your pizza has been ordered.\nCrust: %s\nSauce: %s\nSize: %s\n", crust,sauce,size);
        String pepperoni = req.getParameter("pepperoni");
        String sausage = req.getParameter("sausage");
        String onion = req.getParameter("onion");
        String pineapple = req.getParameter("pineapple");
        String extraCheese = req.getParameter("extra-cheese");

        if(pepperoni != null){
            System.out.printf("Topping: %s\n",pepperoni );
        }
        if(sausage != null){
            System.out.printf("Topping: %s\n",sausage );
        }
        if(onion != null){
            System.out.printf("Topping: %s\n",onion );
        }
        if(pineapple != null){
            System.out.printf("Topping: %s\n",pineapple );
        }
        if(extraCheese != null){
            System.out.printf("Topping: %s\n",extraCheese );
        }
        System.out.printf("address: %s", address);
    }
}
