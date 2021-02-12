package locadora;

/**
 *
 * @author jj
 */
public class Locadora {
    private Disco Discos [];
    private Filme Filmes[];
    private int IndiceD;
    private int IndiceF;

    public Locadora() {
        this.IndiceD = 0;
        this.IndiceF = 0;
        this.Discos = new Disco[2];
        this.Filmes = new Filme[2];
    }

   public void novodisco(Disco disco){
       Discos[IndiceD] = disco;
       IndiceD += 1;
       
   }
   public void novoFilme(Filme filme){
       Filmes[IndiceF] = filme;
       IndiceF += 1;
   }
   public void ListarDiscos(){
       for(int i = 0; i < Discos.length;i++){
           System.out.println("Informações do disco " + i);
           Discos[i].ListaInformações();
       }
   }
   public void ListarFilmes(){
       for(int i = 0; i < Filmes.length;i++){
           System.out.println("Informações do filme " + i);
           Filmes[i].ListaInformações();
        }
   }
}

