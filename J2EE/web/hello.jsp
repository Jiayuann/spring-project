<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.io.*"%>
 你好 JSP<br>
<%
    List<String> words = new ArrayList<String>();
    words.add("One");
    words.add("two");
    words.add("three");
%>
<table width="200px" align="center" border="1" cellspacing="0">
<%
    for(String str:words){
%>
<tr>
    <td><%=str%></td>
</tr>
<%}%>
</table>
<%=new Date().toLocaleString()%>
<%out.println("Hello, jsp");%>