<?php 
    include 'DB/conexion.php';

    if (!empty($_POST['id_pelicula']) and !empty($_POST['nombre']) and !empty($_POST['director']) and !empty($_POST['anio']) and !empty($_POST['sinopsis']) and !empty($_POST['id_categoria']) ) {

        $id_pelicula = $_POST['id_pelicula']; 
        $nombre = $_POST['nombre']; 
        $director = $_POST['director'];
        $anio = $_POST['anio'];
        $sinopsis = $_POST['sinopsis'];
        $id_categoria = $_POST['id_categoria'];

        try {
            $consulta = $base_de_datos->prepare("UPDATE pelicula SET nombre=:nom, director=:dir, anio=:ani, sinopsis=:sin, id_categoria=:id_c WHERE id_pelicula = :id_p");

            $consulta->bindParam(':id_p', $id_pelicula);
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':dir', $director);
            $consulta->bindParam(':ani', $anio);
            $consulta->bindParam(':sin', $sinopsis);
            $consulta->bindParam(':id_c', $id_categoria);
           
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PELICULA##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PELICULA##UPDATE"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
