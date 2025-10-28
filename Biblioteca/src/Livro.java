import java.util.List;

public class Livro extends Obra {
    private String categoriaCientifica;

    public Livro(String titulo, String idioma, int anoEdicao, List<Autor> autores, Editora editora, String categoriaCientifica) {
        super(titulo, idioma, anoEdicao, autores, editora);
        this.categoriaCientifica = categoriaCientifica;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Categoria: " + categoriaCientifica);
        System.out.println("-------------------------");
    }
}

