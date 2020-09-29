<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
member/list.jsp<br><br>

name1 : <%=request.getParameter("name") %><br>
name2 : ${param.name }<br>
name3 : ${name }<br>
name4 : ${requestScope.name }<br>
name5 : <%=request.getAttribute("name") %><br><br>


pw1 :<%=request.getParameter("pw") %> <br>
pw2 : ${param.pw }<br>
pw3 : ${pw }<br>
pw4 : ${requestScope.pw }<br>
pw5 : <%=request.getAttribute("pw") %><br>