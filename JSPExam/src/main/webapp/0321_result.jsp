<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		String chk_info = request.getParameter("chk_info");
		String tel = request.getParameter("tel");
		String [] hobys = request.getParameterValues("hoby");
	%>
	
	이름  : <% out.print(name); %><br>
	아이디  : <% out.print(id); %><br>
	비밀번호  : <% out.print(pw); %><br>
	이메일  : <% out.print(email); %><br>
	취미 : <%for(int i=0; i<hobys.length; i++){out.print(" "+hobys[i]);} %> <br>
	전공  : <% out.print(chk_info); %><br>
	통신사  : <% out.print(tel); %><br>
</body>
</html>