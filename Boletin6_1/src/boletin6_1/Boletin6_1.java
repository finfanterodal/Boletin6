package boletin6_1;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introducimos un número, que debemos pasar a entero.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el número: "));
        //Evaluamos la condición.
        if (numero > 0) {
            //Condición es True.
            JOptionPane.showMessageDialog(null, "\nO número " + numero + " é positivo.");
        }
        //Condición es false.
        JOptionPane.showMessageDialog(null, "\n****Remata o programa***");
    }

}
