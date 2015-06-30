<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" pageEncoding="utf-8" contentType="text/html;charset=utf-8" %>

<div class="container">
    <div class="row">
        <div class="col-sm-12 blog-main">
            <c:forEach items="${posts}" var="post">
                <div class="blog-post">
                    <h2 class="blog-post-title"><c:out value="${post.title}"/></h2>
                    <p class="blog-post-meta"><fmt:formatDate pattern="dd.MM.yyyy HH.mm" value="${post.time}"/>
                                              by <a href="/user/id"><c:out value="${post.postAuthor.login}"/></a></p>
                    <p><c:out value="${post.content}"/></p>
                </div>
            </c:forEach>
        </div>
    </div>
</div>