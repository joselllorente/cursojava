package es.cursojava.poo.herencia.interfaces.ejercicios.pagosonline;

public class ProcesadorPagos {

   public static void realizarPago(Pago metodoPago, double monto){
        metodoPago.procesarPago(monto);
   }
   
}
