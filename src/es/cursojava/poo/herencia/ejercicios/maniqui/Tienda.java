package es.cursojava.poo.herencia.ejercicios.maniqui;

public class Tienda {

    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        // Tienda tienda = new Tienda("Loro piana");
        // Maniqui[] maniquies = tienda.abrirTienda();
        // tienda.mostrarEscaparate(maniquies);
    }

    private Maniqui[] abrirTienda() {
        Vestido vestido = new Vestido("verde", "L", 40);
        Maniqui maniqui1 = new Maniqui(1, vestido);

        Boton boton = new Boton("Negro", "Redondo", "pequeño");
        Pantalon pantalon = new Pantalon("negro", "42", 30, boton);

        Camisa camisa = new Camisa("blanco", "M", 29.90);

        Boton boton1 = new Boton("Negro", "Redondo", "pequeño");
        Boton boton2 = new Boton("Negro", "Redondo", "pequeño");
        Boton boton3 = new Boton("Negro", "Redondo", "pequeño");
        //Boton [] botones = new Boton[3];
        //botones[0]= boton1;

        Boton[] botones = {boton1, boton2, boton3};
        Camisa camisa1 = new Camisa("   ", "M", 29.90, botones);
        Maniqui maniqui2 = new Maniqui(2, camisa1, pantalon);

        Maniqui maniqui3 = new Maniqui(3);

        // Boton b = maniqui2.getCamisa().getBotones()[0];
        // System.out.println(b.getColor());
        // System.out.println(b.getForma());
        // System.out.println(b.getTamanio());

        Maniqui[] maniquies = {maniqui1,maniqui2,maniqui3};

        return maniquies;
    }

    private void mostrarEscaparate (Maniqui[] maniquies){
        
        for (Maniqui maniqui : maniquies) {
            double precioTotal=0;
            System.out.println("Información del maniqui: "+ maniqui.getId());
            //Datos del pantalón
            Pantalon pantalon = maniqui.getPantalon();
            if(pantalon!=null){
                System.out.println("Pantalon:");
                System.out.println("\t Color: "+ pantalon.getColor());
                System.out.println("\t Talla: "+ pantalon.getTalla());
                System.out.println("\t Precio: "+ pantalon.getPrecio());
                System.out.println("\t\t Boton: "+ pantalon.getBoton().getColor());
                precioTotal += pantalon.getPrecio();
            }
            
            Camisa camisa = maniqui.getCamisa();
            if (camisa!=null){
                System.out.println("Camisa:");
                System.out.println("\t Color: "+ camisa.getColor());
                System.out.println("\t Talla: "+ camisa.getTalla());
                System.out.println("\t Precio: "+ camisa.getPrecio());
                Boton[] botones = camisa.getBotones();
                if (botones!=null){
                    for (Boton boton : botones) {
                        System.out.println("\t\t Boton: "+ boton.getColor() +" "+ boton.getForma() 
                        +" "+ boton.getTamanio() );
                        
                    }
                }
                precioTotal += camisa.getPrecio();
            }

            Vestido vestido = maniqui.getVestido();
            if (vestido!=null){
                System.out.println("Vestido:");
                System.out.println("\t Color: "+ vestido.getColor());
                System.out.println("\t Talla: "+ vestido.getTalla());
                System.out.println("\t Precio: "+ vestido.getPrecio());
                precioTotal += vestido.getPrecio();
            }
            System.out.println("Precio total: "+precioTotal);
        }
        
    }
    
    private void desvestirManiquies(Maniqui[] maniquies){

        for (Maniqui maniqui : maniquies) {
            maniqui.desvestir();
        }

    }

}

