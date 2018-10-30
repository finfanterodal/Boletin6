/**
 *Teclear un número e sacar por consola o signo “ + “ se o nº é positivo,
 *o signo “ –“ se é negativo e “ 0 “ se é cero .
 */
package boletin6_3;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Boletin6_3 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduzca el número: "));
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "\n+");
        } //Anidamos otro if dentro del else, y evaluamos una nueva         
        else if (num == 0) {
            JOptionPane.showMessageDialog(null, "\n0");
        } else {
            JOptionPane.showMessageDialog(null, "\n-");
        }
    }

}
