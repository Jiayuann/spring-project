/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jiayuan
 */
import java.util.Date;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
public class HelloServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().println("<h1> Hello Servlet</h1>");
            response.getWriter().println(new Date().toString());
            request.getSession().getAttribute("hi");
            ServletContext application = request.getServletContext();
            int num = (Integer) application.getAttribute("online_number");
            response.getWriter().println(num);
            
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
    public static void main(String []args){
        System.out.println("hi");
    }
}

