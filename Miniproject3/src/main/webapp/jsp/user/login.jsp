<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>User Login</title></head>
<body>
    <h2>User Login</h2>
    <form action="../../UserLoginServlet" method="post">
        Username: <input type="text" name="username" required><br>
        Password: <input type="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>
    <p style="color:red">${param.error}</p>
    <p><a href="register.jsp">New user? Register here</a></p>
</body>
</html>
