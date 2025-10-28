import java.util.List;

public abstract class Obra implements IEmprestavel {
    private int emprestadoPara;
    protected int id;
    private static int nextId = 1;
    protected String titulo;
    protected String idioma;
    protected int anoEdicao;
    protected List<Autor> autores;
    protected Editora editora;

    public Obra(String titulo, String idioma, int anoEdicao, List<Autor> autores, Editora editora) {
        this.id = Obra.nextId;
        Obra.nextId++;
        this.emprestadoPara = -1;
        this.titulo = titulo;
        this.idioma = idioma;
        this.anoEdicao = anoEdicao;
        this.autores = autores;
        this.editora = editora;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Disponível: " + (estaDisponivel() ? "Sim" : "Não"));
        System.out.println("Título: " + titulo);
        System.out.println("Idioma: " + idioma);
        System.out.println("Ano: " + anoEdicao);
        System.out.println("Autores: " + autores);
        System.out.println("Editora: " + editora);
    };

    public boolean estaDisponivel() {
        return this.emprestadoPara == -1;
    }

    public void emprestar(int usuarioId) {
        if(estaDisponivel()) {
            this.emprestadoPara = usuarioId;
        } else {
            System.out.println("Livro está emprestado para: " + emprestadoPara);
        }
    }

    public void devolver() {
        emprestadoPara = -1;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

}
