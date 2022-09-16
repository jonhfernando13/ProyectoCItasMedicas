const url = "http://localhost:8080/cita/guardar";

const formu = document.getElementById("form");
const np = document.getElementById("nombres_apellidos");
const tel = document.getElementById("telefono");
const correo = document.getElementById("correo");
const dia = document.getElementById("date");
const hora = document.getElementById("mytime");
const motivo = document.getElementById("motivo");
const btn = document.getElementById("btn_cita");

/*async function crear_cita(){
    let datos=new FormData();
    datos.append("nombres_apellidos",np.value);
    datos.append("telefono",tel.value);
    datos.append("correo",correo.value);
    datos.append("date",dia.value);
    datos.append("mydate",hora.value);
    datos.append("motivo",motivo.value)
    fetch(url,{
        method: "POST",
        body:datos
    })
    .then (res=>res.json())
    .then(()=>location.reload())
    .then(datos=>{
        console.log(datos)
    })
}*/

formu.addEventListener("submit", (e) => {
  e.preventDefault();
  console.log("porfin");
  var datos = new FormData(formu);
 /* datos={
    "idcita":0,
    "fecha_hora":"2022-09-08 20:01:49",
    "motivo":"Dolor de cabeza",
    "medico_idmedico":1,
    "cliente_idusuario":1
    
}*/
  fetch(url, {
    method: "POST",
    headers:{
      'content-type': 'application/json'
    },
    body: JSON.stringify(datos)
  })
    .then(res => res.json())
    .then(data => {
      console.log(data);
    })
})
