
let contenPrincipal;
let contenPokemones;
let tituloPokemon;
let imgPokemon;
let ruta_iamgen = "img/loading-wtf.gif";
let nextpagina = "";
let backpagina = "";


//lo que se coloque aqui se va a cargar solo si todo esta cargado en el contendor
window.onload = function(){
    contenPrincipal = document.getElementById("contenPrincipal");
    tituloPokemon = document.getElementById("tituloPokemon");
    imgPokemon = document.getElementById("imgPokemon");

    imgPokemon.src = ruta_iamgen;


   
}


function consumoAPI(){
    let endpoint = "https://pokeapi.co/api/v2/pokemon";

    //consumo - AJAX
    fetch(endpoint)
    .then( respuesta => respuesta.json() )
    .then( data => {

        //codigo para ejecutar en caso de tenre el json
        //como respuesta de la API

        contenPrincipal.innerHTML = "";
        

        for (let i = 0; i < data.results.length; i++) {
            let html_temp = `<div col-md-4>
                                <button id="boton_contenido" onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-light fw-bold m-1 mt-0 col-12"> ${data.results[i].name} </button>
                            </div>`;
            
            contenPrincipal.innerHTML += html_temp;
            
        }
        nextpagina = data.next;
        backpagina = data.previous;


        //console.log(data);
        //console.log("-------------------------");
        //console.log(data.next);
        //console.log("-------------------------");
        //console.log(data.results);


      
    });

}


function cargarDetalle(endpoint){
    console.log(endpoint);
    contenPokemones = document.getElementById("contenPokemones");



    fetch(endpoint)
    .then( respuesta => respuesta.json() )
    .then( data => {

       tituloPokemon.innerText = data.name;
       imgPokemon.src = data.sprites.front_default;

    });
  

    

}

function btn_next() {
   
    if (nextpagina) {        
        fetch(nextpagina)
            .then(respuesta => respuesta.json())
            .then(data => {
                
                contenPrincipal.innerHTML = "";

                imgPokemon.src = ruta_iamgen;

               
                for (let i = 0; i < data.results.length; i++) {
                    let html_temp = `<div>
                                        <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-light fw-bold m-1 mt-0 col-12" style = " font: red;"> ${data.results[i].name} </button>
                                    </div>`;
                    
                    contenPrincipal.innerHTML += html_temp;
                }

                nextpagina = data.next;
                backpagina = data.previous;
            });
    } else {
     
        console.log("No hay más resultados.");
    }
}





function btn_back(){
    if (backpagina) {        
        fetch(backpagina)
            .then(respuesta => respuesta.json())
            .then(data => {
                
                contenPrincipal.innerHTML = "";
                imgPokemon.src = ruta_iamgen;
               
                for (let i = 0; i < data.results.length; i++) {
                    let html_temp = `<div>
                                        <button  onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-light fw-bold m-1 mt-0 col-12"> ${data.results[i].name} </button>
                                    </div>`;
                    
                    contenPrincipal.innerHTML += html_temp;
                }
                nextpagina = data.next;
                backpagina = data.previous;
            });
    } else {
     
        console.log("No hay más resultados.");
    }

}