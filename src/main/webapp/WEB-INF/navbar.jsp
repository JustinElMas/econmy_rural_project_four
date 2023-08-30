<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary">

    <div class="container-fluid">

        <a class="navbar-brand" href="/">
            <img src="img/logo-agri.png" alt="logo-de-la-app" class="logo-del-proyecto">
        </a>

        <form class="d-flex" role="search" action="/buscar">

            <input class="form-control me-2" type="search" placeholder="Buscar productos" aria-label="buscar" name="txtBuscar">
            <button class="btn btn-outline-success" type="submit">Buscar</button>
            
        </form>

        <div>
            
            <a href="/perfil" class="d-block h1 m-auto text-center">
                <span class="bi bi-person-circle"></span>
            </a>

            <a href="/vender" class="btn btn-danger">Vender</a>
        </div>


    </div>

  </nav>

<main class="d-flex justify-content-center">
    <c:if test="${not empty errorAtFindContentQuestion}">
    <p class="bg-danger shadow fw-bolder rounded p-3">
        <c:out value="${errorAtFindContentQuestion}"/>
    </p>
    <p class="btn btn-success mx-2 p-3" id="reload">Intenta de nuevo</p>
</c:if>
</main>