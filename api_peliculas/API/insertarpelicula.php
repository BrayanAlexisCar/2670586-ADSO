<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre']) and !empty($_POST['director']) and !empty($_POST['anio']) and !empty($_POST['sinopsis']) and !empty($_POST['id_categoria'])) {

        $nombre = $_POST['nombre'];
        $anio = $_POST['anio'];
        $sinopsis = $_POST['sinopsis'];
        $id_categoria = $_POST['id_categoria'];


        try {
            $consulta = $base_de_datos->prepare("INSERT INTO pelicula (nombre,director, anio, sinopsis, id_categoria) VALUES(:nom, :dir, :ani, :sin, :id_c) ");
            $consulta->bindParam(':nom', $nombre);
            $consulta->bindParam(':dir', $director);
            $consulta->bindParam(':ani', $anio);
            $consulta->bindParam(':sin', $sinopsis);
            $consulta->bindParam(':id_c', $id_categoria);
           
            $proceso = $consulta->execute();

            if( $proceso && $consulta->rowCount()!=0){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##PELICULA##INSERT"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##PELICULA##INSERT"
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
