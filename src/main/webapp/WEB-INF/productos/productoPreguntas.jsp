<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<main class="container">
    
    <!-- form para la pregunta con modelattribute -->

    <form:form action="" method="post" modelAttribute="pregunta" class="row g-3 my-3 bg-warning rounded fw-bolder text-white w-50">

      <p>
          <form:label path="contenido">Pregunta: </form:label>
          <form:input type="text" path="contenido"/>
          <form:errors path="contenido"/>
      </p>

      <button class="btn btn-success">Enviar</button>

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

              <ul class="answer">

                <li>
                    <c:out value="${question.contenido}"/>
                </li>

              </ul>

            </div>
            
        </div>

      </div>

    </c:forEach>


  </main>