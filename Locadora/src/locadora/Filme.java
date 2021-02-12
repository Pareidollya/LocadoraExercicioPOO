package locadora;

/**
 *
 * @author jj
 */
public class Filme extends item{
    private String diretor;
    private String duração;
    private String genero;

    public Filme(String diretor, String duração, String genero, String titulo, String ano, String comentario) {
        super(titulo, ano, comentario);
        this.diretor = diretor;
        this.duração = duração;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public void ListaInformações(){
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Ano de Lançamento: "+this.getAno());
        System.out.println("Comentátio: "+this.getComentario());
        System.out.println("Diretor: "+this.getDiretor());
        System.out.println("Duração: "+this.getDuração());
        System.out.println("Gênero: "+this.getGenero());
    
}
}