
package locadora;

/**
 *
 * @author jj
 */
public abstract class item {
    public String titulo;
    public String ano;
    public String comentario;

    public item() {
    }

    public item(String titulo, String ano,String comentario) {
        this.titulo = titulo;
        this.ano = ano;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public abstract void ListaInformações();
}
