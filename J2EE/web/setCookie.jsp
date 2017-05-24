<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" import="javax.servlet.http.*"%>

<%
    Cookie c = new Cookie("name","garen");
    c.setMaxAge(60*24*60);
    c.setPath("127.0.0.1");
    response.addCookie(c);
%>
Below are cookies
<br>
<%
    Cookie[] cookies = request.getCookies();
   // out.println(cookies[1].getName() +":"+ cookies[1].getValue());
%>