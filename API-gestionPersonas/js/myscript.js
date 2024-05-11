let cedula;
let nombres;
let apellidos;
let telefono;
let direccion;
let email;
let foto = '';




window.onload = function(){
    contenPrincipal = document.getElementById("contenPrincipal");

}
function cargarPersonas() {
    let endpoint = "https://codetesthub.com/API/Obtener.php";
    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        contenPrincipal.innerHTML = "";
        console.log('respuesta JSON:');
        console.log(data);

        let contador = 3;
        for (let i = 0; i < data.length; i++) {
            let html_temp = 
            `
            <div id="container_data" class="container mb-4 mt-4">
                <div class="col-12">
                    <div class="card" style="width: 30rem; height: 22rem">
                        <div class="card-body border border-black">
                            <img onclick="cargarDetallesPersonas('${data[i].foto}')" alt="imagen">
                            <h5 onclick="cargarDetallesPersonas('${data[i].cedula}')" class="fw-bold m-1 mt-2 col-12"> Cedula: ${data[i].cedula} </h5>
                            <h5 onclick="cargarDetallesPersonas('${data[i].nombres}')" class="fw-bold m-1 mt-3 col-12">  Nombres: ${data[i].nombres} </h5>
                            <h5 onclick="cargarDetallesPersonas('${data[i].apellidos}')" class="fw-bold m-1 mt-3 col-12">  Apellidos: ${data[i].apellidos} </h5>
                            <h5 onclick="cargarDetallesPersonas('${data[i].telefono}')" class="fw-bold m-1 mt-3 col-12"> Telefono: ${data[i].telefono} </h5>
                            <h5 onclick="cargarDetallesPersonas('${data[i].direccion}')"class="fw-bold m-1 mt-3 col-12"> Direccion: ${data[i].direccion} </h5>
                            <h5 onclick="cargarDetallesPersonas('${data[i].email}')" class="fw-bold m-1 mt-3 col-12">  Email: ${data[i].email} </h5>
                        </div>
                    </div>
                </div>
            </div>`;
            
            contenPrincipal.innerHTML += html_temp;
            contador++;
        }
    });
}
         


function cargarDetallesPersonas(endpoint) {
   

    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        
        foto.src = data.foto;
        cedula.innerHTML = data.cedula; 
        nombres.innerHTML = data.nombres;
        apellidos.innerHTML = data.apellidos;
        telefono.innerHTML = data.telefono;
        direccion.innerHTML = data.direccion;
        email.innerHTML = data.email;

       

      
    });
}


function insertarPersona() {

    let endpoint = ("https://codetesthub.com/API/Insertar.php");
    let datos = new FormData();
    
  
    datos.append("cedula", 102);
    datos.append("nombres", "brayan");
    datos.append("apellidos", "crack");
    datos.append("telefono", "345345");
    datos.append("direccion", "Calle 7, Ciudad barrancabermeja");
    datos.append("email", "aveces@example.com");
    datos.append("foto", "walter.png");
    
   
    
    let configuracion = {
        method: "POST",
        Headers: {
            "Accept": "application/json",
        },
        body: datos,

    };
   
   fetch(endpoint , configuracion)
   .then(respuesta => respuesta.json())
    .then(data => {
        
        contenPrincipal.innerHTML = "";
        console.log('respuesta JSON:');
        console.log(data);

        cargarPersonas();
         
        
    });

}



function ActualizarPersona() {
    
    let endpoint = ("https://codetesthub.com/API/Actualizar.php");
    let datos = new FormData();
    
    datos.append("cedula", 102);
    datos.append("nombres", "brayan 2.0");
    datos.append("apellidos", " brayan 2.0 actualizado");
    datos.append("telefono", "NUEVO DATO");
    datos.append("direccion", "NUEVO DATO");
    datos.append("email", "NUEVO DATO");
    
   
    
    let configuracion = {
        method: "POST",
        Headers: {
            "Accept": "application/json",
        },
        body: datos,

    };
   
    fetch(endpoint , configuracion)
    .then(respuesta => respuesta.json())
    .then(data => {
        
        contenPrincipal.innerHTML = "";
        console.log('respuesta JSON:');
        console.log(data);

        cargarPersonas();
         
        
    });

}


function EliminarPersona() {
    
    let endpoint = ("https://codetesthub.com/API/Eliminar.php");
    let datos = new FormData();
    
    datos.append("cedula",  102);
   
    
    let configuracion = {
        method: "POST",
        Headers: {
            "Accept": "application/json",
        },
        body: datos,

    };
   
    fetch(endpoint , configuracion)
    .then(respuesta => respuesta.json())
    .then(data => {
        
        contenPrincipal.innerHTML = "";
        console.log('respuesta JSON:');
        console.log(data);

        cargarPersonas();
         
        
    });
}
