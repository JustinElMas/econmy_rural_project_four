<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<main class="container">
    
    <!-- form para la pregunta con modelattribute -->

    <form:form action="" method="post" modelAttribute="pregunta" class="custom-form">
      <div class="mb-3">
        <form:label path="contenido" class="form-label custom-label">Pregunta:</form:label>
        <form:input type="text" path="contenido" class="form-control custom-input"/>
        <form:errors path="contenido" class="text-danger"/>
      </div>
      <button class="btn custom-button">Enviar</button>
    </form:form>
    
    <!-- mostrar la pregunta en la vista -->
    <h2 class="text-center">Tus preguntas:</h2>

    
    <c:forEach items="${preguntas}" var="question">

      <h1>
        <c:out value="${question.producto.titulo}"/>
      </h1>
   
      <div class="container text-center">

        <div class="row">

          <div class="faq-container">

            <div class="faq-item">

              <ul class="answer bg-primary p-4 rounded text-white h5 shadow">

                <li class="d-flex justify-content-between align-items-center">
                    <c:out value="${question.contenido}"/>

                    <a onclick="deleteItem([['${question.id}']])" class="btn btn-outline-none">
                        <span class="bi bi-trash h4 m-2 text-danger bg-white p-2 rounded m-2"></span>
                    </a>

                </li>

              </ul>

            </div>
            
        </div>

      </div>

    </c:forEach>


  </main>