<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary">

    <div class="container-fluid">

        <a class="navbar-brand" href="/">
            <span class="bi bi-compass shadow rounded mx-4" style="font-size: 4rem;"></span>
        </a>

        <form class="d-flex" role="search">

            <input class="form-control me-2" type="search" placeholder="Buscar productos" aria-label="buscar">
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