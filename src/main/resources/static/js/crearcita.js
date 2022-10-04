const url = "http://localhost:8080"

function crear(evt) {
  evt.preventDefault();
  let cita = {
    idcita: 0,
    fecha_hora: evt.target.fecha_hora.value,
    motivo: evt.target.motivo.value,
    medico_idmedico: 1,
    cliente_idusuario: 1,

  };
  console.log(cita);
  guardar_datos(cita);
}

async function guardar_datos(cita) {
  const resp = await fetch(url+"/guardar/", {
    method: "POST",
    headers: {
      Accept: "application/json",
      "content-type": "application/json",
    },
    body: JSON.stringify(cita),
   
  })
    .then((res) => res.json())
    .then((data) =>  console.log(data))
    .catch((err) => console.log(err))
    window.location.href = url+"/gestion/";
}







