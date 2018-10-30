/*
*Coñecidos o nome e o peso de dúas persoas,
*queremos escribir os datos da que pesa máis e, a diferenza de peso entre elas .
 */
package boletin6_4;

/**
 *
 * @author finfanterodal
 */
public class Boletin6_4 {
    
    public static void main(String[] args) {
        Personas persona1 = new Personas("Fran", 60);
        Personas persona2 = new Personas("Parcero", 115);
        //LLamamos al método para calcular el mayor y la diferencia.
        persona1.maisPesoDiferencia(persona2);
        
    }
    
}
