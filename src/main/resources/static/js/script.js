const toastTrigger = document.getElementById('liveToastBtn');
const toastLiveExample = document.getElementById('liveToast');
const btnReload = document.getElementById('reload');


if (toastTrigger) {
  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
  toastTrigger.addEventListener('click', () => {
    toastBootstrap.show()
  })
}

btnReload.addEventListener("click", reloadPage);

function reloadPage() {
  window.location.href = "http://localhost:8080/productos";
}

/* delete con js and jquery */
function deleteItem(id) {
  swal({
      title: "Atención. ¿Estás seguro de ELIMINAR?",
      text: "Estás tratando de eliminar este item, si deseas hacerlo da clic en ok, si no puedes dar clic en cancelar",
      icon: "warning",
      buttons: true,
      dangerMode: true,
  }).then((OK) => {
      if (OK) {
          $.ajax({
              url: "/productos/"+id+"/delete",  
              success: function(res) {
                  console.log("Entro a delete" + res);
                  swal("Genial, tu item ha sido eliminado", {
                      icon: "success",
                  }).then((ok) => {
                      if (ok) {
                          location.href = "/productos";
                      }
                  });
              },
          });
      } else {
          swal("Uff, Tu item ha sido salvado!");
      }
  });
}