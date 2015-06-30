<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<div class="container">
    <form:form modelAttribute="post" method="POST" action="/post/add" enctype="">
        <div class="form-group">
            <h2 class="title">Новый пост</h2>
            <form:input type="text" class="form-control" id="postTitle" placeholder="Заголовок" path="title"/>
        </div>
        <div class="form-group">
            <form:textarea class="form-control" rows="15" placeholder="Текст" path="content"/>
        </div>
        <button type="submit" class="btn btn-default">Опубликовать</button>
    </form:form>
</div>