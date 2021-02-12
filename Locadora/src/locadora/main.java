
package locadora;

/**
 *
 * @author jj
 */
public class main {

    public static void main(String[] args) {
        Disco disco1 = new Disco("Vérios artistas","12","CD","Samba Social Clube 5","2014","Vários Sambas");
        Disco disco2 = new Disco("Ivete Sangalo","14","DVD","Pode entrar","2009","Ivete e convidados");
        Filme filme1 = new Filme("Raja Gosnell","140","Animação","Smurfs 2","2013","Gargamel cria a versão malvada dos Smurfs");
        Filme filme2 = new Filme("Simon West","210","Animação","Os mercenarios 2","2012","De volta ao mundo");
        
        Locadora locadoraB = new Locadora();
        locadoraB.novodisco(disco1);
        locadoraB.novodisco(disco2);
        locadoraB.novoFilme(filme1);
        locadoraB.novoFilme(filme2);
        locadoraB.ListarDiscos();
        locadoraB.ListarFilmes();
    }
    
}
