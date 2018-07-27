<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/27
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/register" method="post">
        <table border="2">
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value="小华"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" value="qwer123456"></td>
            </tr>
            <tr>
                <td>注册时间</td>
                <td><input type="text" name="hiredate" value="2018-07-26"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</body>
</html>
