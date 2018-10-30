/*
 *  7- Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras . 
 *   O usuario premerá a opción desexada .Según esta o programa pediralle os datos precisos e,
 *   utilizando un switch…case visualizará o resultado .
 *   No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “ opción incorrecta “.
 *   1…. Cadrado
 *   2…. Triangulo
 *   3…. Circulo
 */
package boletin6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Figuras {

    private int menu;

    public void calcularSuperficies() {
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("\n1: Superficie Triángulo. "
                    + "\n2: Superficie Círculo. "
                    + "\n3: Superficie Cuadrado."
                    + "\n4: Salir."));
            switch (menu) {
                case 1:
                    menu = 1;
                    double base = Double.parseDouble(JOptionPane.showInputDialog("\nBase"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("\nAltura"));
                    JOptionPane.showMessageDialog(null, "\nSuperficie Triángulo = " + (base * altura / 2));
                    break;
                case 2:
                    menu = 2;
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("\nRadio"));
                    JOptionPane.showMessageDialog(null, "\nSuperficie Círculo = " + (Math.PI * Math.pow(radio, 2)));
                    break;
                case 3:
                    menu = 3;
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("\nLado"));
                    JOptionPane.showMessageDialog(null, "\nSuperficie Cuadrado = " + (Math.pow(lado, 2)));
                    break;
            }
        } while (menu != 4);

    }
}


