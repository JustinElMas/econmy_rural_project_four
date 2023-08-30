<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
    crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/css/style.css">
    <link type="image/png" sizes="32x32" rel="icon" href="/img/icon-leaf.png">
    <title>Respuestas a tu búsqueda</title>
</head>
<body>

    <%@ include file="../navbar.jsp" %>

    <h2 class="p-4">Respuestas a tu búsqueda</h2>

    <ul class="mb-4 border-bottom border-2 border-success p-2">
        <li class="h4 mx-4">
            <c:out value="${preguntaResult.contenido}"/>
        </li>
    </ul>

    <a href="/productos" class="btn btn-primary fw-bolder mx-5">Volver <span class="bi bi-arrow-left"></span></a>
  

    <%@ include file="../footer.jsp" %>

    
</body>
</html>