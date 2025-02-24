package es.cursojava.excepciones;

import es.cursojava.poo.ejercicios.alumnos.Alumno;

public class EjemploExcepciones {
    public static void main(String[] args) {
        System.out.println("Inicio");
        Alumno alumno1 = null;
        try {
            metodo1();
        } catch (MiExcepcion e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try{
            String[] colores = {"azul","blanco"};
            
            System.out.println(7/0);
            System.out.println(colores[2]);
            System.out.println(alumno1.getNombre());
            
        }catch(NullPointerException npe){
            System.out.println("Error1: "+npe.getMessage());
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error2: "+aiobe.getMessage());
        }catch(Exception e){
            System.out.println("Error General: "+e.getMessage());
        }finally{
            System.out.println("SE EJECUTA SIEMPRE");
            //Cierro fichero
        }
        System.out.println("Fin");
    }


    public static void metodo1 () throws MiExcepcion{
        if (Math.random()>0.5){
            //throw new NullPointerException("Error null creado por mi");
            MiExcepcion me = new MiExcepcion("Mensaje de mi propia excepción");
            throw me;
        }else{
            System.out.println("Todo ha ido bien");
        }
    }
}
