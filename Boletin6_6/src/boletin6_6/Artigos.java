/*
* Un almacen clasifica os seus productos según a seguinte táboa  de vendas anuais :
* Vendas anuais			            artigo de consumo 
* < = 100 productos				baixo
* >100 e < = 500				medio
* > 500 e < = 1000 				alto
* > 1000 					primeira necesidade
*    Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é
 */
package boletin6_6;
import javax.swing.JOptionPane;
/**
 *
 * @author finfanterodal
 */
public class Artigos {
    //Atributos
    private String nomeArtigo;
    private int ventasAnuais;
    //Constructor
    public Artigos(String nomeArtigo, int ventasAnuais){
        this.nomeArtigo=nomeArtigo;
        this.ventasAnuais=ventasAnuais;      
    }
    //Métodos
    public void tipoArtigo(){
        if (ventasAnuais<= 100){
            JOptionPane.showMessageDialog(null, "\n O artigo: "+nomeArtigo+" é do tipo, baixo");
        }else if(ventasAnuais <= 500){
            JOptionPane.showMessageDialog(null, "\n O artigo: "+nomeArtigo+" é do tipo, medio");
        }else if(ventasAnuais <= 1000){
            JOptionPane.showMessageDialog(null, "\n O artigo: "+nomeArtigo+" é do tipo, alto");
        }else{
            JOptionPane.showMessageDialog(null, "\n O artigo: "+nomeArtigo+" é do tipo, primeira necesidade");
        }
        
    }
    
}
