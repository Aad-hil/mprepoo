<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Attempt Quiz</title></head>
<body>
    <h2>Quiz: ${quiz.quizName}</h2>
    <form action="../../QuizServlet" method="post">
        <input type="hidden" name="quizId" value="${quiz.quizId}">
        <c:forEach var="q" items="${questions}">
            <p>${q.questionText}</p>
            <input type="radio" name="answer_${q.questionId}" value="A"> ${q.optionA}<br>
            <input type="radio" name="answer_${q.questionId}" value="B"> ${q.optionB}<br>
            <input type="radio" name="answer_${q.questionId}" value="C"> ${q.optionC}<br>
            <input type="radio" name="answer_${q.questionId}" value="D"> ${q.optionD}<br>
        </c:forEach>
        <input type="submit" value="Submit Quiz">
    </form>
</body>
</html>
