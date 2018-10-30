/*
*Implementa un programa no que se tecleen dous números de tipo short .
*Se o primeiro é maior ou igual que o segundo,visualizaremos a resta .
*En calquera caso visualizaremos a suma .
 */
package boletin6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Boletin6_2 {

    public static void main(String[] args) {
        //Introducimos los dos números de tipo short, y tenemos que convertir de String a short
        short num1 = Short.parseShort(JOptionPane.showInputDialog("\nIntroduzca el número: "));
        short num2 = Short.parseShort(JOptionPane.showInputDialog("\nIntroduzca el número: "));
        //Comparamos num1 y num2, para saber el mayor y en función de eso hacemos una cosa u otra.
        if (num1 >= num2) {
            //Cuando el resultado es true. 
            JOptionPane.showMessageDialog(null, "\nResta=  " + num1 + " - " + num2 + " = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "\nSuma=  " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else {
            //Cuando el resultado es false.
            JOptionPane.showMessageDialog(null, "\nSuma=  " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }

}
