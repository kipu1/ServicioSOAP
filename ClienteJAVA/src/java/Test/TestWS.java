/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author ASUS ROG
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear clients
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente =  servicio.getWSOperacionesPort();
        
        //utlizar metodos 1 login
        if(cliente.login("kevin", "1234")){
            System.out.println("Los datos ingresados son correctos");
            
        }else{
            System.out.println("Los datos ingresados son incorrectos");
        }
        // 2 procesar pagos
        if(cliente.procesarPago(100, 1000)!=-1){
            System.out.println("Pago realizado con exito");
            System.out.println("Su vuelto es de: "+cliente.procesarPago(100, 1000));
        }else{
            System.out.println("Saldo insuficiente");
        }
//        System.out.println(cliente.procesarPago(100,1000));
    }
    
}
