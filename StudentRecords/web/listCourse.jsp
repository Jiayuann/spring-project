

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page isELIgnored="false"%>
<h2 align="center">Courses Info</h2>
<div style="margin:0px auto; width:500px">
<table border="1" cellspacing="0" width="500px">
    <tr>
        <td>course id</td>
        <td>student id</td>
        <td>course name</td>
    </tr>    	    
<s:iterator value="courses" var="p">
	<tr>
            <td>${p.c_id}</td>
            <td>${p.p_id}</td>
            <td>${p.name}</td>
	</tr>
</s:iterator>
</table>