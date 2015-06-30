<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>

<nav class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">tinyblog
                <!--img alt="tinyblog" src="${pageContext.request.contextPath}/images/sun-symbol-48.png"/-->
            </a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="/post/add">Добавить пост</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><p class="navbar-btn"><a class="btn btn-success" href="/login" role="button">Войти</a></p></li>
            </ul>
        </div>
    </div>
</nav>