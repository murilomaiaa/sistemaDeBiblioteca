import java.util.List;

public abstract class Obra {
    protected String titulo;
    protected String idioma;
    protected int anoEdicao;
    protected List<Autor> autores;
    protected Editora editora;

    public Obra(String titulo, String idioma, int anoEdicao, List<Autor> autores, Editora editora) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.anoEdicao = anoEdicao;
        this.autores = autores;
        this.editora = editora;
    }

    public abstract void exibirInformacoes();
}
