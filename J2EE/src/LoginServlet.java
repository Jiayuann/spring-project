/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiayuan
 */
import java.io.*;
import java.util.*;
import bean.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet{
    protected void service(HttpServletRequest request, 
        HttpServletResponse response)throws ServletException, IOException{
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("name:" + name);
        System.out.println("password:" + password);
        System.out.println(request.getHeader("user-agent"));
        
        if(name.equals("admin") && password.equals("password")){
            request.getSession().setAttribute("userName", name);
            response.sendRedirect("listHero");
        }else{
            response.sendRedirect("login.html");   
        }
        String html = "<p style = 'color:red'>try again..</p>";
        PrintWriter pw = response.getWriter();
        pw.println(html);
    } 
}
