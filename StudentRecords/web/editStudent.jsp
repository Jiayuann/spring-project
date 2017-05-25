<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@page isELIgnored="false"%>

<form align="center" action="updateStudent" method="post">
    name: <input name="student.name" value="${student.name}"> <br>
    gender: <input type="text" name="student.gender" value="${student.gender}"><br>
    GPA: <input type = "text" name="student.gpa" value="${student.gpa}"><br>
    <input name="student.p_id" type="hidden" value="${student.p_id}"> 
    <button type="submit">Submit</button>
</form>
