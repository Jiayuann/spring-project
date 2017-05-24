<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<form action="upload" method="post" enctype="multipart/form-data">
    upload files:
    <input type="file" name="doc">
    <br>
    <input type="submit" value="submit">
</form>