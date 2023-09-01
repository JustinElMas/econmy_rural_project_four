<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
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
    <title>Edit pregunta</title>
</head>
<body>

    <%@ include file="../navbar.jsp" %>

    <main class="p-3 mb-3">

        <h1>Edit Pregunta</h1>

        <c:if test="${not empty errorAtEdit}">
            
            <p class="text-danger">
                <c:out value="${errorAtEdit}"/>
            </p>

        </c:if>

        <form:form action="/preguntas/${pregunta.id}" method="post" modelAttribute="pregunta" class="h4">
            <input type="hidden" name="_method" value="put">

            <p class="mt-4">
                <form:label path="contenido">Pregunta:</form:label>
                <form:errors path="contenido"/>
                <form:input path="contenido" readonly="true" class="btn btn-white font-text"/>
            </p>
    
            <p>
                <form:label path="respuesta">Respuesta:</form:label>
                <form:errors path="respuesta"/>
                <form:textarea path="respuesta" class="form-control"/>
            </p>
        
            <input type="submit" value="Responder" class="btn btn-success"/>
        </form:form>

    </main>


    <a href="/productos" class="mx-3 p-3 bg-primary rounded h5 text-white"><- Volver</a>
    
    <%@ include file="../footer.jsp" %>

</body>
</html>