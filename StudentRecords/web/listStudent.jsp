
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page isELIgnored="false"%>
<h2 align="center">Students Info</h2>
<div style="margin:0px auto; width:500px">
<table border="1" cellspacing="0" width="500px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>gender</td>
        <td>GPA</td>
        <td>edit</td>
        <td>delete</td>
        <td>course</td>
    </tr>    	    
<s:iterator value="students" var="p">
	<tr>
            <td>${p.p_id}</td>
            <td>${p.name}</td>
            <td>${p.gender}</td>
            <td>${p.gpa}</td>
            
            <td><a href="editStudent?student.p_id=${p.p_id}">edit</a></td>
            <td><a href="deleteStudent?student.p_id=${p.p_id}">delete</a></td>	
            <td><a href="listCourse?course.p_id=${p.p_id}">course</a></td>
	</tr>
</s:iterator>
</table>
<br>
<br>
<form action="addStudent" method="post">
    Name: <input name="student.name"> <br>
    Gender:    <select name="student.gender">
                <option value="m">Male</option>
                <option value="f">Female</option>
               </select><br>
    GPA: <input type="text" name="student.gpa">
    
    <button type="submit">Submit</button>
</form>
</div>