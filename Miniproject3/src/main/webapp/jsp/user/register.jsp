<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>User Registration</title></head>
<body>
    <h2>Register New User</h2>
    <form action="../../RegistrationServlet" method="post">
        Username: <input type="text" name="username" required><br>
        Password: <input type="password" name="password" required><br>
        Email: <input type="email" name="email" required><br>
        <input type="submit" value="Register">
    </form>
    <p style="color:red">${param.error}</p>
</body>
</html>
