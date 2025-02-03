package es.cursojava.poo.herencia.ejercicios.maniqui;

public class Maniqui {
    private int id;
    private Camisa camisa;
    private Pantalon pantalon;
    private Vestido vestido;
    
   
    public Maniqui(int id) {
        this.id = id;
    }

    public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
        this.id = id;
        this.camisa = camisa;
        this.pantalon = pantalon;
    }

    public Maniqui(int id, Vestido vestido) {
        this.id = id;
        this.vestido = vestido;
    }

    public int getId() {
        return id;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Pantalon getPantalon() {
        return pantalon;
    }

    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    public Vestido getVestido() {
        return vestido;
    }

    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }

    public void desvestir(){

        this.vestido=null;
        this.pantalon=null;
        this.camisa=null;

    }



    
    

}

