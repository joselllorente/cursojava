package es.cursojava.poo.herencia.interfaces.ejercicios.pagosonline;

import es.cursojava.inicio.funciones.Utilidades;

public class MainPagos {
    public static void main(String[] args) {
        PagoPaypal pagoPaypal = new PagoPaypal();
        PagoTarjetaCredito pagoTarjeta = new PagoTarjetaCredito();
        PagoCriptomonedas pagoTransferencia = new PagoCriptomonedas();

        MainPagos mp = new MainPagos();
        mp.metodoPago(new Pago[]{pagoPaypal,pagoTarjeta,pagoTransferencia});
    }

    private void metodoPago(Pago[] pagos){

        for (Pago pago : pagos) {
            int cantidad = Utilidades.pideDatoNumerico("Introduce cantidad a pagar");
            ProcesadorPagos.realizarPago(pago, cantidad);
        }

    }
}
