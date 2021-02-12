
package locadora;

/**
 *
 * @author jj
 */
public class main {

    public static void main(String[] args) {
        Disco disco1 = new Disco("Vérios artistas","12","CD","Samba Social Clube 5","2014","Vários Sambas");
        Disco disco2 = new Disco("Ivete Sangalo","14","DVD","Pode entrar","2009","Ivete e convidados");
        //Filme filme1 = new Filme();
        //Filme filme2 = new Filme();
        
        Locadora locadoraB = new Locadora();
        locadoraB.novodisco(disco1);
        locadoraB.novodisco(disco2);
        locadoraB.ListarDiscos();
    }
    
}
