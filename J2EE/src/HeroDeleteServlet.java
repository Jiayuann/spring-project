import java.io.*;
import java.util.*;
import bean.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class HeroDeleteServlet extends HttpServlet{
    protected void service(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException{
     int id = Integer.parseInt(request.getParameter("id"));
     new HeroDAO().delete(id);
     response.sendRedirect("/listHero");
    }
}
