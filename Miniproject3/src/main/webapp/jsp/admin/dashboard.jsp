<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Admin Dashboard</title>
</head>
<body>
    <h2>Welcome Admin: ${sessionScope.admin}</h2>
    <ul>
        <li><a href="addQuestion.jsp">Add Question</a></li>
        <li><a href="questionList.jsp">View Questions</a></li>
        <li><a href="createQuiz.jsp">Create Quiz</a></li>
        <li><a href="quizList.jsp">View Quizzes</a></li>
    </ul>
</body>
</html>
