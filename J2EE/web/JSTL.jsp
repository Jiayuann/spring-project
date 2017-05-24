<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<c:set var="name" value="${'gareen'}" scope="request" />
<c:set var="hp" value="${10}" scope="session" />
<c:set var="weapon" value="${'newweapon'}" scope="page" />
 
通过标签获取name: <c:out value="${name}" /> <br>
<c:remove var="name" scope="request" /> <br>

 
<c:if test="${hp<5}"> 
    <p>这个英雄要挂了</p>
</c:if>
<c:if test="${!(hp<5)}">
    <p>这个英雄觉得自己还可以再抢救抢救</p>
</c:if>
<c:if test="${weapon.startsWith('new')}">
    <p>没有装备武器</p>
</c:if>
<%
    String []heros = {"garen", "ahis", "akali"};
    request.setAttribute("heros",heros);
%>
<br>
<!-- 使用JSTL中的c:forEach 循环来遍历List -->
<table align="center" border="1">
<c:forEach items="${heros}" var="hero" varStatus="st"  >
    <tr>
        <td><c:out value="${st.count}" /></td>
        <td><c:out value="${hero}" /></td>
    </tr>
</c:forEach>
</table>