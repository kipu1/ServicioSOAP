/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS ROG
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * This is a sample web service operation
     */
  
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        if(usuario.equals("kevin")&& contraseña.equals("1234")){
            return true;
        }else{
            return false;
 
        }
}
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if(pago>=total){
            //retornar vuelto
            return pago - total;
        }else{
           return -1;  
        }
       
    }
}
