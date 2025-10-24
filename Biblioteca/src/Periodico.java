import java.util.List;

public class Periodico extends Obra {
    private String tipo;

    public Periodico(String titulo, String idioma, int anoEdicao, List<Autor> autores, Editora editora, String tipo) {
        super(titulo, idioma, anoEdicao, autores, editora);
        this.tipo = tipo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("📰 Periódico:");
        System.out.println("Título: " + titulo);
        System.out.println("Idioma: " + idioma);
        System.out.println("Ano: " + anoEdicao);
        System.out.println("Tipo: " + tipo);
        System.out.println("Autores: " + autores);
        System.out.println("Editora: " + editora);
        System.out.println("-------------------------");
    }
}

