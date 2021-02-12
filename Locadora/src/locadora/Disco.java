
package locadora;

/**
 *
 * @author jj
 */
public class Disco extends item{
    private String Artista;
    private String QntFaixas;
    private String Midia;
    

    public Disco(String Artista, String QntFaixas, String Midia, String titulo, String ano, String comentario) {
        super(titulo, ano, comentario);
        this.Artista = Artista;
        this.QntFaixas = QntFaixas;
        this.Midia = Midia;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getQntFaixas() {
        return QntFaixas;
    }

    public void setQntFaixas(String QntFaixas) {
        this.QntFaixas = QntFaixas;
    }

    public String getMidia() {
        return Midia;
    }

    public void setMidia(String Midia) {
        this.Midia = Midia;
    }

 
    @Override
    public void ListaInformações(){
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Ano de Lançamento: "+this.getAno());
        System.out.println("Comentátio: "+this.getComentario());
        System.out.println("Artista: "+this.getArtista());
        System.out.println("Quantidade de Faixas: "+this.getQntFaixas());
        System.out.println("Midia: "+this.getMidia());
        
    }
 
}
