/*
* 6.Un almacen clasifica os seus productos según a seguinte táboa  de vendas anuais :
* Vendas anuais			            artigo de consumo 
* < = 100 productos				baixo
* >100 e < = 500				medio
* > 500 e < = 100 				alto
* > 1000 					primeira necesidade
*    Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é
 */
package boletin6_6;

/**
 *
 * @author finfanterodal
 */
public class Boletin6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creamos Obxecto
Artigos artigo1= new Artigos("Lavadora",600);
//Llamamos al método para saber el tipo 
artigo1.tipoArtigo();
        
        
    }
    
}
