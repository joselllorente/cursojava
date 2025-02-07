package es.cursojava.poo.herencia.ejercicios.vehiculos;

public class Garaje {
    private String nombre;
    private int maximoCoches;
    private int maximoMotos;
    private int maximoCamiones;
    private Vehiculo[] plazas;

    public Garaje(String nombre, int maximoCoches, int maximoMotos, int maximoCamiones) {
        this.nombre = nombre;
        this.maximoCoches = maximoCoches;
        this.maximoMotos = maximoMotos;
        this.maximoCamiones = maximoCamiones;
        plazas = new Vehiculo[maximoCamiones+maximoCoches+maximoMotos];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaximoCoches() {
        return maximoCoches;
    }

    public void setMaximoCoches(int maximoCoches) {
        this.maximoCoches = maximoCoches;
    }

    public int getMaximoMotos() {
        return maximoMotos;
    }

    public void setMaximoMotos(int maximoMotos) {
        this.maximoMotos = maximoMotos;
    }

    public int getMaximoCamiones() {
        return maximoCamiones;
    }

    public void setMaximoCamiones(int maximoCamiones) {
        this.maximoCamiones = maximoCamiones;
    }

    public Vehiculo[] getPlazas() {
        return plazas;
    }

    public void setPlazas(Vehiculo[] plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Garaje [nombre=" + nombre + ", maximoCoches=" + maximoCoches + ", maximoMotos=" + maximoMotos
                + ", maximoCamiones=" + maximoCamiones + "]";
    }

    
    public void aparcarVehiculo(Vehiculo vehiculo){
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i]==null){
                plazas[i]=vehiculo;
                System.out.println("Vehiculo "+vehiculo.getMarca() +" aparcado en la plaza "+ (i+1));
                break;
            }
        }
    }

    public boolean hayHueco (Vehiculo vehiculo){
        boolean hayHueco= false;
        int contador = 0;
        //Cuento cuantos vehiculos del mismo tipo que el vehiculo que me pasan 
        //hay en el garage
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i]!=null && plazas[i].getClass().equals(vehiculo.getClass()) ){
                contador++;
            }
        }
        
        if (vehiculo instanceof Coche){
            hayHueco = contador < maximoCoches;
        }else if (vehiculo instanceof Motocicleta) {
            Motocicleta moto = (Motocicleta)vehiculo;

            hayHueco = contador < maximoMotos && !moto.isTieneSidecar();
        }else if (vehiculo instanceof Camion) {
            hayHueco = contador < maximoCamiones;
        }

        return hayHueco;
    }
}
