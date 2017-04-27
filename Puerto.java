
/**
 * Write a description of class Puerto here.
 * 
 * @author Valerie Santos
 * @2.0
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
     * Metodo que permite aÃ±adir un nuevo alquiler y devuelve el precio del alquiler
     * en funcion del numero de dias y el tipo del barco
     * @param numDias nos da el numero de dias que se quiere alquilar un amarre
     * @param barco es un parametro que le pasamos de tipo Barco
     * @return precio de dicho alquiler
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
     * Metodo que permite liquidar un amarre y devuelve el precio del alquiler.
     * @param posicionAmarre nos pasan como parametro la posicion del amarre que queremos liquidar
     * @return precio total del alquiler     
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
     * Metodo que nos muestra el estado de los amarres si estan disponiles y si no lo
     * estan nos imprime todos los datos correspondientes a ese amarre.
     */

    public void verEstadoAmarres(){
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] == null){ // compruebo que la posicion que le paso no este ocupada
                System.out.println("El amarre " +  i  + " esta disponible");
            }

            else{

                System.out.println("El amarre " +  i + " no está disponible para alquiler!");
                System.out.println("Amarre: " + i + " \n");
                System.out.println(alquileres[i].toString());

            }
        }
    }

    /**
     * Metodo privado para obtener posiciones libres de amarre
     * @return la posicion del primer amarre disponible
     */

    private int posicionPrimerAmarreLibre(){
        int posicionPrimerAmarre = 0;
        boolean buscando = false;

        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] == null && buscando == false){  
                posicionPrimerAmarre = i;
                buscando = true; // si  lo cambio a true, la proxima vez que se quiera meter en el if no va a entrar.
            }
        }
        return posicionPrimerAmarre;
    }

    /** 
     * Metodo que devuelve true o false dependiendo de si existen amarres
     * disponibles(true) para alquilar o no(false)
     * @return true o false si hay o no amarres disponibles
     */

    public boolean hayAmarresLibres(){
        boolean buscando = false;
        for(int i = 0; i < alquileres.length; i++){
            if(alquileres[i] ==  null && buscando == false){  //comprueba si hay posiciones en null 

                buscando = true; // cambia el boolean a true y ya no se vuelve a ejecutar
            }
        }
        return buscando;
    }
}

