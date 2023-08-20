<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <title>Detalles del producto</title>
</head>
<body>

    <%@ include file="navbar.jsp" %>

    <h2 class="m-3">Detalles del producto</h2>

    <main class="container">

        <div class="card" style="width: 18rem;">
            
            <img src="https://agraria.pe/imgs/a/lx/cajamarca-lima-y-arequipa-producen-la-mitad-de-la-leche-en-n-30912.jpg" class="card-img-top" alt="imagen-de-muestra-del-producto">

            <div class="card-body">

                <p class="card-text">Leche para ti con mucho amor hecha en el suroeste de Perú, solo anota tu ruta y te digo si paso por ahí.</p>
                <button type="submit" class="btn btn-danger">Solicitar</button>
            
            </div>

        </div>

        <!-- place holder for card -->

<!--         <div class="card" aria-hidden="true">
            <img src="..." class="card-img-top" alt="...">
            <div class="card-body">
              <h5 class="card-title placeholder-glow">
                <span class="placeholder col-6"></span>
              </h5>
              <p class="card-text placeholder-glow">
                <span class="placeholder col-7"></span>
                <span class="placeholder col-4"></span>
                <span class="placeholder col-4"></span>
                <span class="placeholder col-6"></span>
                <span class="placeholder col-8"></span>
              </p>
              <a class="btn btn-primary disabled placeholder col-6" aria-disabled="true"></a>
            </div>
          </div> -->

          <!-- formulario para pregunta -->

          <form class="row g-3 my-3 bg-warning rounded fw-bolder text-white">
            <div class="col-auto">
              <label for="staticEmail2" class="visually-hidden">Email</label>
              <input type="text" readonly class="form-control-plaintext" id="staticEmail2" value="Escribe tu pregunta">
            </div>
            <div class="col-auto">
              <label for="inputPassword2" class="visually-hidden">Pregunta</label>
              <input type="password" class="form-control" id="inputPassword2" placeholder="Escribe aquí tu pregunta">
            </div>
            <div class="col-auto">
              <button type="submit" class="btn btn-success mb-3">Preguntar</button>
            </div>
          </form>

    </main>
    
</body>
</html>