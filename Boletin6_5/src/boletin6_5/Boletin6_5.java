/*
* Dados 3 números que se supon distintos , indicar cal é o maior
 */
package boletin6_5;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Boletin6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos variables:
        int num1;
        int num2;
        int num3;
        //Directamente sin hacer dos pasos:        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el segundo número"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el tercer número: "));
        //Condicional if Anidado:
        if (num1 > num2) {
            if (num1 > num3) {
                JOptionPane.showMessageDialog(null, "\nO primeiro número " + num1 + " é o maior.");
            }
            JOptionPane.showMessageDialog(null, "\nO terceiro número " + num3 + " é o maior.");
        } else if (num2 > num3) {
            JOptionPane.showMessageDialog(null, "\nO segundo número " + num2 + " é o maior.");
        } else {
            JOptionPane.showMessageDialog(null, "\nO terceiro número " + num3 + " é o maior.");
        }

    }

}
