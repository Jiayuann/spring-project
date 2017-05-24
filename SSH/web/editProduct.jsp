<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@page isELIgnored="false"%>

<form align="center" action="updateProduct" method="post">
    name: <input name="product.name" value="${product.name}"> <br>
    price: <input type="text" name="product.price" value="${product.price}"><br>
    <input name="product.id" type="hidden" value="${product.id}"> 
    <button type="submit">提交</button>
</form>
