<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입
	</h1>
    <form method="post" action="0321_result.jsp" name="login" >
        <table border="1px" >
            <tr>
                <td>이름</td><td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>아이디</td><td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>비밀번호</td><td><input type="password" name="pw"></td>
            </tr>
            <tr>
                <td>비밀번호 확인</td><td><input type="password" name="cpw"></td>
            </tr>            
            <tr>
                <td>이메일</td><td><input type="email" name="email"></td>
            </tr>
            <tr>
            	<td>취미</td><td>
            					<input type="checkbox" name="hoby" value="독서" > 독서
            					<input type="checkbox" name="hoby" value="요리" > 요리
            					<input type="checkbox" name="hoby" value="조깅" >  조깅
            					<input type="checkbox" name="hoby" value="게임" > 게임
            					<input type="checkbox" name="hoby" value="취침" > 취침
            				</td>
            </tr>
            <tr>
                <td>전공</td><td>
								<input type="radio" name="chk_info" value="영어">영어
								<input type="radio" name="chk_info" value="수학" >수학
								<input type="radio" name="chk_info" value="컴퓨터">컴퓨터
								<input type="radio" name="chk_info" value="디자인">디자인
						   </td>
            </tr>
            <tr><td>전화번호</td>
            	<td>
            		<select name="tel">
            			<option value="SKT">SKT</option>
            		</select>
            	</td>
            </tr>
            <tr >
                <td colspan="2" style="text-align: center;">
               
                    <input type="submit" class="asd" value="전송" onClick=""></input>
                    <input type="reset" value="초기화"></input>
                </td>
            </tr>
        </table>

    </form>

</body>
</html>