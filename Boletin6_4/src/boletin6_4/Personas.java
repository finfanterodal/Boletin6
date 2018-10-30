/*
Coñecidos o nome e o peso de dúas persoas,
queremos escribir os datos da que pesa máis e, a diferenza de peso entre elas .
 */
package boletin6_4;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 * @version 1
 */
public class Personas {

    //Atributos
    private String nome;
    private int peso;

    //Constructor
    public Personas(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void maisPesoDiferencia(Personas c) {
        if (c.peso > peso) {
            JOptionPane.showMessageDialog(null, "\nNombre: " + c.nome
                    + "\nPeso:" + c.peso+" kg");
            JOptionPane.showMessageDialog(null, "\nDiferencia de peso = " + c.peso + "-" + peso + " = " + (c.peso - peso)+" kg");
        } else {
            JOptionPane.showMessageDialog(null, "\nNombre: " + nome
                    + "\nPeso:" + peso+" kg");
            JOptionPane.showMessageDialog(null, "\nDiferencia de peso = " + peso + "-" + c.peso + " = " + (peso - c.peso)+" kg");
        }
    }
}
