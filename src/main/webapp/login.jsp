<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<c:url var="registerUrl" value="/register" />

<div class="container">
    <form class="form-signin">
        <h2 class="form-signin-heading">Вход</h2>
        <label for="inputLogin" class="sr-only">Логин</label>
        <input type="text" id="inputLogin" class="form-control" placeholder="Логин" required autofocus>

        <label for="inputPassword" class="sr-only">Пароль</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Пароль" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Запомнить меня
            </label>
        </div>
        <button class="btn btn-lg btn-success btn-block" type="submit">Войти</button>

        <div>
            <p><a class="btn btn-lg btn-link" href="${registerUrl}" role="button">Регистрация</a></p>
        </div>
    </form>
</div>