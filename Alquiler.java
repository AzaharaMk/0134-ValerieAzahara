
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     */
    public Alquiler( int numeroDias, int posicionAmarre, Barco barco)
    {
       
        this.numeroDias = numeroDias;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    /**
     * Metodo que permite obtener  el precio del alquiler
     */
    public float getPrecioAlquiler()
    {
        float precioAlquiler;
        
        precioAlquiler = (float)(numeroDias * (VALOR_MULTIPLICADOR_ESLORA * barco.getEslora())
          + (VALOR_MULTIPLICADOR_BERNUE * barco.getCoeficienteBernua()));
        
          return precioAlquiler;
    }
    
    
    public String toString(){
        String cadenaADevolver = "";
        cadenaADevolver += "Numero de dias: "+ numeroDias +"\nPosicion: " +  posicionAmarre + " " + barco.toString()  + "\n";

        
        return cadenaADevolver;    
    }
    
    
    
    
    
    
}
