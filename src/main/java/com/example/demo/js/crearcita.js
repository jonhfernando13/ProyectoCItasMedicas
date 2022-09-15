
const url = "http://localhost:8080"

//const formu =document.querySelector("form")
const np =document.getElementById("nombres_apellidos")
const tel =document.getElementById("telefono")
const correo =document.getElementById("correo")
const dia =document.getElementById("date")
const hora =document.getElementById("mytime")
const motivo =document.getElementById("motivo")
const btn =document.getElementById("btn_cita")


async function crear_cita(){
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
    .then(datoss=>{
        console.log(datos)
    })
}

btn.addEventListener("submit",(e)=>{
    e.preventDefault();
    data();
})

