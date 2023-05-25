<?php
// crear cliente
$cliente = new SoapClient('http://localhost:8080/ServicioWeb_SOAP/WSOperaciones?WSDL');
//utilizar metodo
$resulado_pago = $cliente->procesarPago([
    "total"=> 100,
    "pago"=> 1000
])->return;
if($resulado_pago>=0){
    echo "pago realizado,su vuelto es$resulado_pago";
}else{
    echo "dinero insuficiente";
}


// login
$resultadoLogin = $cliente->login([
    "usuario" => "kevin",
    "contraseña" => "1234"
]);

if ($resultadoLogin) {
    echo "Los datos ingresados son correctos";
} else {
    echo "Los datos ingresados son incorrectos";
}
