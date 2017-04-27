
/**
 * Write a description of class Alquiler here.
 * 
 * @author Valerie Santos
 * @version 2.0
 */
public class Alquiler 
{

    private int  numeroDias;
    private int posicionAmarre;
    private Barco barco;
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUE = 300;

    /**
     * Constructor for objects of class Alquiler
     * @param numeroDias nos dan el numero de dias que se desea alquilar el amarre
     * @param posicionAmarre la posicion en que se va alquilar el barco
     * @param parametro de tipo Barco 
     */
    public Alquiler( int numeroDias, int posicionAmarre, Barco barco)
    {
       
        this.numeroDias = numeroDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    /**
     * Metodo que permite obtener  el precio del alquiler
     * @return el precio del alquiler del barco
     */
    public float getPrecioAlquiler()
    {
        float precioAlquiler;
        
        precioAlquiler = (float)(numeroDias * (VALOR_MULTIPLICADOR_ESLORA * barco.getEslora())
          + (VALOR_MULTIPLICADOR_BERNUE * barco.getCoeficienteBernua()));
        
          return precioAlquiler;
    }
    
    /**
     * Metodo que devuelve una cadena de String con los datos del alquiler
     * @return datos asociados a la clase Alquiler
     */
    public String toString(){
        String cadenaADevolver = "";
        cadenaADevolver += "Numero de dias: "+ numeroDias +"\n Posicion: " +  posicionAmarre + " " + barco.toString()  + "\n";
        return cadenaADevolver;    
    }
    
}
