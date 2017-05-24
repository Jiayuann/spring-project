/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jiayuan
 */
import bean.Hero;
import bean.HeroDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HeroAddServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        Hero hero = new Hero();
        hero.setName(request.getParameter("name"));
        hero.setHp(Float.parseFloat(request.getParameter("hp")));
        hero.setDamage(Integer.parseInt(request.getParameter("damage")));
        
        new HeroDAO().add(hero);
        response.sendRedirect("/listHero");
    }
}
