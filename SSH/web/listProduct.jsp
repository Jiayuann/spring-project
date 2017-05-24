<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page isELIgnored="false"%>

<div style="margin:0px auto; width:500px">
<table border="1" cellspacing="0" width="500px">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>edit</td>
        <td>delete</td>
    </tr>    	    
<s:iterator value="products" var="p">
	<tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td><a href="editProduct?product.id=${p.id}">edit</a></td>
            <td><a href="deleteProduct?product.id=${p.id}">delete</a></td>		
	</tr>
</s:iterator>
</table>
<br>
<br>
<form action="addProduct" method="post">
    name: <input name="product.name"> <br>
    price: <input type="text" name="product.price" value="0">
    <button type="submit">提交</button>
</form>
</div>