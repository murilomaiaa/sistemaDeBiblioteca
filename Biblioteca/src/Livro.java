import java.util.List;

public class Livro extends Obra {
    private String categoriaCientifica;

    public Livro(String titulo, String idioma, int anoEdicao, List<Autor> autores, Editora editora, String categoriaCientifica) {
        super(titulo, idioma, anoEdicao, autores, editora);
        this.categoriaCientifica = categoriaCientifica;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("📘 Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Idioma: " + idioma);
        System.out.println("Ano: " + anoEdicao);
        System.out.println("Categoria: " + categoriaCientifica);
        System.out.println("Autores: " + autores);
        System.out.println("Editora: " + editora);
        System.out.println("-------------------------");
    }
}

