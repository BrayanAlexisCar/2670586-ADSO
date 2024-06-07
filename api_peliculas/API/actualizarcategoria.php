<?php 
    include 'DB/Conexion.php';

    if (!empty($_POST['nombre'])) {

        $nombre = $_POST['nombre'];
       

        try {
            $consulta = $base_de_datos->prepare("UPDATE categoria SET nombre=:nom WHERE nombre = :nom");

            $consulta->bindParam(':nom', $nombre);
            
           
            
            $proceso = $consulta->execute();

            if( $proceso ){
                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CATEGORIA##UPDATE"
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CATEGORIA##UPDATE"
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
