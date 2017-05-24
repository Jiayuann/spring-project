<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="bean.Hero"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
1. Get value
    <c:set var="name" value="${'jane'}" scope="session"/>
    JSP:<c:out value="${name}" /><br>
    JEL: ${name}
2. Java bean
    <%  Hero hero =new Hero();
        hero.setName("Jinx");
        hero.setHp(550);  
        request.setAttribute("hero", hero);%> 
    Name:${hero.name} <br>
    HP:${hero.hp}   <br>
3. Get param
    http://127.0.0.1/JSTL_EL.jsp?name=ahri
    ${param.name}
    ${header.host}
4. EL Expressions
    <%request.setAttribute("killNumber", "10");%>
    ${killNumber == 10? "超神":"还没超神" }
    ${'hip' gt 'hit'}
   
