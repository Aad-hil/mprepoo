<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Leaderboard</title></head>
<body>
    <h2>Leaderboard for Quiz: ${quiz.quizName}</h2>
    <table border="1">
        <tr><th>User</th><th>Score</th><th>Date</th></tr>
        <c:forEach var="entry" items="${leaderboard}">
            <tr>
                <td>${entry.username}</td>
                <td>${entry.score}</td>
                <td>${entry.attemptedAt}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
