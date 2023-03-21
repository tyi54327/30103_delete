<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>계산기</h2>
	<form method="post">
		<input type="text" name="front">
		 <select name="operator" id="">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<input type="text" name="back">
		<input type="submit" value="계산">
		<input type="button" value="초기화">
	</form>
	<hr>
	결과 : 
	<%
	String operator = request.getParameter("operator");
	String front = request.getParameter("front");
	String back = request.getParameter("back");
	%>
	<%
			
			int sum=0;
			
			if(front != null && back != null) {
				int front1=Integer.parseInt(front);
				int back1=Integer.parseInt(back);
				if(operator.equals("+")){
				sum = front1+back1;
				out.print(sum);
			}
			else if(operator.equals("-")){
				sum = front1-back1;
				out.print(sum);
			}
			else if(operator.equals("*")){
				sum = front1*back1;
				out.print(sum);
			}
			else if(operator.equals("/")){
				sum = front1/back1;
				out.print(sum);
			}
			}
			%>
</body>
</html>