from zeep import Client

#crear cliente
cliente = Client('http://localhost:8080/ServicioWeb_SOAP/WSOperaciones?WSDL')

#login

if cliente.service.Login("kevin","12334"):
    print ("Los datos ingresados son correctos")
else:
    print("Los datos ingresados son incorrectos")

#2 Procesar pago
if cliente.service.ProcesarPago(10000, 1000)>=0:
    print("Pago realizado con éxito")
    print("Su vuelto es de: " + str(cliente.service.ProcesarPago(100, 1000)))
else:
    print("Saldo insuficiente")