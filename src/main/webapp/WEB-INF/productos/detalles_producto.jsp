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
    <link rel="stylesheet" href="/css/style.css">
    <link type="image/png" sizes="32x32" rel="icon" href="/img/icon-leaf.png">
    <title>Detalles del producto</title>
  </head>
<body>
  
  <%@ include file="../navbar.jsp" %>
  
  <h2 class="m-3">Detalles del producto</h2>
  
  <main class="container shadow rounded p-3 d-flex justify-content-between">
    
    <div class="card card-detalle-producto" style="width: 18rem;">
      
      <img src="https://agraria.pe/imgs/a/lx/cajamarca-lima-y-arequipa-producen-la-mitad-de-la-leche-en-n-30912.jpg" class="card-img-top" alt="imagen-de-muestra-del-producto">

      <div class="card-body">
        
        <p class="card-text">Leche para ti con mucho amor hecha en el suroeste de Perú, solo anota tu ruta y te digo si paso por ahí.</p>

                <button type="submit" class="btn btn-danger">Solicitar</button>
            
                <button type="button" class="btn btn-primary my-3" id="liveToastBtn">Recordarme más tarde</button>
    
                <div class="toast-container position-fixed bottom-0 end-0 p-3">
                  <div id="liveToast" class="toast" role="alert" aria-live="assertive" aria-atomic="true">
                    <div class="toast-header">
                      <span class="bi bi-star mx-2"></span>
                      <strong class="me-auto">Mensaje</strong>
                      <small>11 mins ago</small>
                      <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
                    </div>
                    <div class="toast-body">
                      En breve recibirás más info
                    </div>
                  </div>
                </div>

                <!--  notifiación  -->
                <p>5 estrellas</p>

                <p>$20.000 peso</p>

                <p>10 kg</p>

            </div>
            
          </div>

          <div class="container info-contacto w-25 border rounded p-3">


            <div class="card p-2" style="width: 18rem;">
              <img src="https://i.pinimg.com/564x/69/fc/f6/69fcf604bc6e652c94954c23040dbad3.jpg" class="card-img-top p-2 rounded-circle img-fluid card-perfil" alt="imagen-de-perfil">
              <div class="card-body">
                
                <ul>

                  <li class="card-text">Nombre: Fernando</li>
                  <li class="card-text">Edad: 39 años</li>
                  <li class="card-text">Ubicación: Perú</li>
                  <li class="card-text">Productor de: Leche y granos</li>

                </ul>

              </div>


            </div>

            <button type="submit" class="btn btn-danger my-3">Ver más como este</button>

            <div class="container text-center">

              <div class="row row-cols-2">

                <div class="col my-2">
                  
                  <div class="card">
                    <img src="https://images.pexels.com/photos/5946720/pexels-photo-5946720.jpeg?cs=srgb&dl=pexels-charlotte-may-5946720.jpg&fm=jpg" alt="imagen-de-producto" class="card-img-top rounded-circle mx-auto my-3 img-ver-productos">
                    <div class="card-body">
                      <a class="card-title btn btn-warning" href="/">Leche entera</a>
                    </div>
                  </div>

                </div>

                <div class="col my-2">

                  <div class="card">
                    <img src="https://img.freepik.com/foto-gratis/delicioso-queso-sobre-tabla-madera_144627-43573.jpg" alt="imagen-de-producto" class="card-img-top rounded-circle mx-auto my-3 img-ver-productos">
                    <div class="card-body">
                      <a class="card-title btn btn-warning" href="/">Queso</a>
                    </div>
                  </div>

                </div>

                <div class="col my-2">

                  <div class="card">
                    <img src="https://img.freepik.com/foto-gratis/alto-angulo-mujer-sosteniendo-semillas-plantar-maceta_23-2148850876.jpg" alt="imagen-de-producto" class="card-img-top rounded-circle mx-auto my-3 img-ver-productos">
                    <div class="card-body">
                      <a class="card-title btn btn-warning" href="/">Semillas</a>
                    </div>
                  </div>

                </div>


                <div class="col my-2">

                  <div class="card">
                    <img src="https://img.freepik.com/foto-gratis/varios-legumbres_53876-47070.jpg" alt="imagen-de-producto" class="card-img-top rounded-circle mx-auto my-3 img-ver-productos">
                    <div class="card-body">
                      <a class="card-title btn btn-warning" href="/">Granos</a>
                    </div>
                  </div>

                </div>



            </div>
          
        </main>

        </div>
        
        <!-- section questions -->

        <%@ include file="productoPreguntas.jsp" %>

        <!-- carrusel -->
        
        <div id="carouselExampleSlidesOnly" class="carousel slide rounded shadow mb-5" data-bs-ride="carousel" style="max-height: 300px;">
          <div class="carousel-inner my-3">

            <div class="carousel-item active">
              <img src="https://images.pexels.com/photos/625422/pexels-photo-625422.jpeg?auto=compress&cs=tinysrgb&w=400" class="d-block mx-auto rounded" alt="imagen-de-referencia" style="max-height: 100%;">
            </div>

            <div class="carousel-item">
              <img src="https://static.vecteezy.com/system/resources/thumbnails/008/023/460/small/woman-cut-slice-cheese-for-cook-using-knife-in-the-kitchen-people-making-food-with-cheese-concept-free-video.jpg" class="d-block mx-auto rounded" alt="imagen-de-referencia" style="max-height: 100%;">
            </div>
            
          </div>
        </div>
 
        <br>

    <!-- script js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <script src="/js/script.js"></script>

    <%@ include file="../footer.jsp" %>

</body>
</html>