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
public class HeroListServlet extends HttpServlet{
     protected void service(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException{
        String userName = (String)request.getSession().getAttribute("userName");
        if(userName == null){
            response.sendRedirect("login.html");
            return;
        }
        int start = 0,count = 5;
        try{
            start = Integer.parseInt(request.getParameter("start"));
        }catch(NumberFormatException e){
        }
        List<Hero> heros = new HeroDAO().list(start,count); 
        int next = start + count;
        int prev = start - count < 0? 0:start - count;
        request.setAttribute("next",next);
        request.setAttribute("prev",prev);
        request.setAttribute("heros",heros);
        request.getRequestDispatcher("listHero.jsp").forward(request,response);
     }
}
