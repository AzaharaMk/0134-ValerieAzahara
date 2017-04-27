
/**
 * Write a description of class Puerto here.
 * 
 * @Valerie (your name) 
 * @1.0 (a version number or a date)
 */
public class Puerto 
{
    // instance variables - replace the example below with your own
    private Alquiler[] alquileres;
    private Barco barco;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[4];
    }

    /**
     * Metodo que permite añadir un nuevo alquiler
     */
    public float alquilarAmarre(int numDias, Barco barco){
        float precioAlquiler = -1;

        if(hayAmarresLibres()){//compruebo si hay algun amarre libre
            int posicionAmarre = posicionPrimerAmarreLibre();
            alquileres[posicionAmarre] = new Alquiler(numDias, posicionAmarre, barco);

            precioAlquiler = alquileres[posicionAmarre].getPrecioAlquiler();
        }
        return precioAlquiler;
    }

    /**
     * Metodo que permite liquidar un amarre y devuelve el precio de del alquiler.
     */

    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precioTotal = -1;
        if(posicionAmarre >= 0 && posicionAmarre <= alquileres.length  && alquileres[posicionAmarre]!= null) {
            // compruebo que la posicion del amarre sea mayor que 0, que esa posicion no este ocupada(null).
            precioTotal = alquileres[posicionAmarre].getPrecioAlquiler();

            alquileres[posicionAmarre] = null;

        }
        return  precioTotal;
    }

    /**
     * Metodo que nos muestra el estado de los amarres
     */

    public void verEstadoAmarres(){

        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] == null){ // compruebo que la posicion que le paso no este ocupada
                System.out.println("El amarre " +  i  + " está disponible");
            }

            else{
                
                System.out.println("¡El amarre " +  i + " no está disponible para alquiler!");
                System.out.println("**Amarre: " + i + " \n");
                System.out.println(alquileres[i].toString());

            }
        }
    }

    /**
     * Metodo privado para obtener posiciones libres de amarre
     */

    private int posicionPrimerAmarreLibre(){

        int contador = 0;
        boolean buscando = false;

        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] == null && buscando == false){  
                contador = i;
                buscando = true; // si  lo cambio a true, la proxima vez que se quiera meter en el if no va a entrar.
            }
        }
        return contador;
    }

    /** 
     * Metodo que devuelve true o false dependiendo de si existen amarres
     * disponibles(true) para alquilar o no(false)
     */

    public boolean hayAmarresLibres(){
        boolean buscando = false;
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] ==  null && buscando == false){
                buscando = true;
            }
        }
        return buscando;
    }
}

