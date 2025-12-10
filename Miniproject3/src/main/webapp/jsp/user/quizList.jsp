<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Quiz List</title></head>
<body>
    <h2>Available Quizzes</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Action</th></tr>
        <c:forEach var="quiz" items="${quizzes}">
            <tr>
                <td>${quiz.quizId}</td>
                <td>${quiz.quizName}</td>
                <td><a href="attemptQuiz.jsp?quizId=${quiz.quizId}">Attempt</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
