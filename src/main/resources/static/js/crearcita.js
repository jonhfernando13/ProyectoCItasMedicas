const url = "http://localhost:8080/cita/guardar";



function crear(evt){
e.preventDefault();
let form = document.getElementById("form");
const np = document.getElementById("nombres_apellidos");
const tel = document.getElementById("telefono");
const correo = document.getElementById("correo");
const dia = document.getElementById("date");
const hora = document.getElementById("mytime");
const motivo = document.getElementById("motivo");
const btn = document.getElementById("btn_cita");
}
form.addEventListener("submit", (e) => {
  e.preventDefault();

  const datos = new FormData(form);
  /* datos={
    "idcita":0,
    "fecha_hora":"2022-09-08 20:01:49",
    "motivo":"Dolor de cabeza",
    "medico_idmedico":1,
    "cliente_idusuario":1,
    "telefono":5454545,
    "correo":"ssasa"
}*/
  fetch(url, {
    method: "POST",
    headers: {
      "Accept":"application/json",
      "content-type": "application/json",
    },
    body: JSON.stringify(datos),
  })
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.log(err));
});
