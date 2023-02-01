import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name;
        try{
            name = req.getParameter("name");
        }catch(Exception e){
            name = null;
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if( name != null){
            out.printf("<h1>Hello, %s!</h1>",name);
        }
        else{
            out.println("<h1>Hello, World!</h1>");;
        }
    }
}
