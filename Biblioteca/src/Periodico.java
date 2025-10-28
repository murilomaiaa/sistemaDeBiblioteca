import java.util.List;

public class Periodico extends Obra {
    private String tipo;

    public Periodico(String titulo, String idioma, int anoEdicao, List<Autor> autores, Editora editora, String tipo) {
        super(titulo, idioma, anoEdicao, autores, editora);
        this.tipo = tipo;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: " + tipo);
        System.out.println("-------------------------");
    }
}

