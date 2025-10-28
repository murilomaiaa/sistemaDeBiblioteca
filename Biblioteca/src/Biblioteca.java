import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Obra> obras;
    private List<Usuario> usuarios;

    Biblioteca() {
        Editora editora = new Editora("Addison-Wesley", new Endereco("Rua das Editoras", "100", "Centro", "São Paulo", "SP", "01000-000"));
        
        Autor martin = new Autor("Martin Fowler", "USA");
        Autor kent = new Autor("Kent Beck", "USA");
        List<Autor> autoresRefactoring = new ArrayList<Autor>();
        autoresRefactoring.add(martin);
        autoresRefactoring.add(kent);
        Livro refactoring = new Livro("Refactoring", "Inglês", 1999, autoresRefactoring, editora, "Programação");

        Autor robert = new Autor("Robert C Martin", "USA");
        List<Autor> autoresCleanArch = new ArrayList<Autor>();
        autoresCleanArch.add(robert);
        Livro cleanArch = new Livro("Clean Architecture", "Inglês", 2017, autoresCleanArch, editora, "Programação");

        Periodico isys = new Periodico("iSys - Revista Brasileira de Sistemas de Informação", "Português", 2024, new ArrayList<Autor>(), editora, "Programação");

        this.obras = new ArrayList<>();
        this.obras.add(refactoring);
        this.obras.add(cleanArch);
        this.obras.add(isys);

        this.usuarios = new ArrayList<Usuario>();
        Usuario usuario = new Aluno("Joao Maia", "11111111111", new Endereco("Natal", "25", "Bairro", "Ipatinga", "MG", "35171000"), "31996453742", "joao@mail.com", "Sistemas");
        this.usuarios.add(usuario);
    }

    public List<Obra> getObras() {
        return obras;
    }

    public List<Obra> listaObrasDisponiveis() {
        List<Obra> obrasDisponiveis = new ArrayList<Obra>();
        for(Obra obra : this.obras) {
            if (obra.estaDisponivel()) {
                obrasDisponiveis.add(obra);
            }
        }

        return obrasDisponiveis;
    }

    public List<Obra> listaObrasEmprestadas() {
        List<Obra> obrasEmprestadas = new ArrayList<Obra>();
        for(Obra obra : this.obras) {
            if (!obra.estaDisponivel()) {
                obrasEmprestadas.add(obra);
            }
        }

        return obrasEmprestadas;
    }

    public void cadastraAluno(Aluno aluno) {
        this.usuarios.add(aluno);
    }

    public void listaUsuarios() {
        this.usuarios.forEach(Usuario::exibirDados);
    }

    public void usuarioPegaObraEmprestada(int usuarioId, int obraId) {
        Usuario usuario = null;
        Obra obra = null;
        
        for (Usuario u : this.usuarios) {
            if (u.getId() == usuarioId) {
                usuario = u;
                break;
            }
        }
        
        for (Obra o : this.obras) {
            if (o.getId() == obraId) {
                obra = o;
                break;
            }
        }
        
        if (usuario == null) {
            System.out.println("Usuário com ID " + usuarioId + " não encontrado.");
            return;
        }
        
        if (obra == null) {
            System.out.println("Obra com ID " + obraId + " não encontrada.");
            return;
        }
        
        if (!obra.estaDisponivel()) {
            System.out.println("Obra '" + obra.getTitulo() + "' não está disponível para empréstimo.");
            return;
        }
        
        obra.emprestar(usuarioId);
        System.out.println("Empréstimo realizado com sucesso!");
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Obra: " + obra.getTitulo());
    }

    public void devolveObra(int obraId){
        Obra obra = null;

        for (Obra o : this.obras) {
            if (o.getId() == obraId) {
                obra = o;
                break;
            }
        }

        if (obra == null) {
            System.out.println("Obra com ID " + obraId + " não encontrada.");
            return;
        }

        obra.devolver();
        System.out.println("Obra devolvida com sucesso");
    }
}
