<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        body { background: url(${pageContext.servletContext.contextPath}/img/stalker3.jpg); }
    </style>

    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/header.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/main.css" type="text/css">
    <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js" type="text/javascript"></script>

    <title>Choice group</title>
</head>
<body>

<nav class="b-header_mainmenu"><ul>
    <li><a href="${pageContext.servletContext.contextPath}/user/main" title="Играть">Играть</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/updateUser" title="Профиль">Профиль</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/resources" title="Ресурсы">Ресурсы</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/stalkers" title="Сталкеры">Сталкеры</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/gallery" title="Галерея">Галерея</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/test" class="current" title="Тест">Тест</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/about" title="Об игре">Об игре</a></li>
</ul></nav>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">

        <table align="center" bgcolor="#f0f8ff">

                <tr class="form-group"><td>
                    <script type="application/javascript" src="${pageContext.servletContext.contextPath}/questionnaire/jquery-1.9.1.min.js"></script>
                    <script type="application/javascript" src="${pageContext.servletContext.contextPath}/questionnaire/mustache-2.2.1.min.js"></script>
                    <script type="application/javascript" src="${pageContext.servletContext.contextPath}/questionnaire/q1.js"></script>
                    <link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/questionnaire/q.css"/>

                    <h1 align="center">Тест по серии игр STALKER</h1>


                    <p>Желаешь проверить свои познания о серии игр STALKER? Тогда ты зашел куда надо.</p>

                    <div id="tibo2016" class="qRoot">

                        <div class="qQuestionTemplate">
                            <div class="qContentPanel">
                                <div class="qQuestion">
                                    {{{question}}}
                                </div>
                                <div class="qAnswers">
                                    <form>
                                        {{#answers}}
                                        <div class="qAnswer">
                                            <input type="radio" id="qAnswer_{{index}}" name="qAnswer" value="{{index}}" onchange="answeredQuestion(this)">
                                            <label for="qAnswer_{{index}}">{{{answer}}}</label>
                                        </div>
                                        <b></b>
                                        {{/answers}}
                                    </form>
                                </div>
                            </div>
                        </div>

                        <div class="qResultTemplate">
                            <div class="qResultPanel">
                                <div class="qResultPanelHeader">Результаты:</div>
                                <div class="qResultPanelText">
                                    Правильных ответов {{correctAnswers}} из {{questions}}. {{{result.text}}}
                                </div>
                            </div>
                        </div>

                        <div class="qContent"></div>

                        <div class="qButtons">
                            <!--<input type="button" onclick="answerQuestion('#tibo2016')" value="Ответить" class="qBtnAnswer">-->
                            <input  type="button" onclick="checkQuestion('#tibo2016')" value="Проверить" class="qBtnCheck">
                            <input  type="button"  onclick="continueToNextQuestion('#tibo2016')" value="Продолжить" class="qBtnContinue">
                        </div>
                    </div>

                    <script type="application/javascript">
                        showQuestion('#tibo2016');
                    </script>

                </td></tr>
        </table>
    </div></div>
</body>
</html>
