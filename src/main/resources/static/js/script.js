const toastTrigger = document.getElementById('liveToastBtn');
const toastLiveExample = document.getElementById('liveToast');
const btnReload = document.getElementById('reload');

// generarPlanes.js

const numCards = 10; // Cambia esto al número deseado de tarjetas

const plansContainer = document.querySelector('#plans-container');

for (let i = 0; i < numCards; i++) {
  const planData = {
    recommended: i === 0, // La primera tarjeta es recomendada
    title: `Plan ${i + 1}`,
    price: 99 + i, // Incrementa el precio para cada tarjeta
    saving: `* Suscríbete hoy y accede a todas las noticias (${i + 1})`
  };

  plansContainer.innerHTML += `
    <article class="plans-container--card">
      ${planData.recommended ? '<p class="recommended">Recomendado</p>' : ''}
      <div class="plan-info-container">
        <h3 class="plan-card--title">${planData.title}</h3>
        <p class="plan-card--price"><span>$</span>${planData.price}</p>
        <p class="plan-card-saving">${planData.saving}</p>
        <button class="plan-card--ca">Escoger este <span class="icon icon-arrow-right2"></span></button>
      </div>
    </article>
  `;
}

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

