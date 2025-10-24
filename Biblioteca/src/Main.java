import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua das Flores", 123, "Centro", "São Paulo", "SP", "01000-000");
        Endereco end2 = new Endereco("Av. Brasil", 456, "Jardins", "Rio de Janeiro", "RJ", "20000-000");


        Aluno aluno = new Aluno("Pedro Rik", "123.456.789-00", end1, "99999-9999", "pedro@musica.com", "Engenharia de Som");
        Professor professor = new Professor("Carlos Silva", "987.654.321-00", end2, "98888-8888", "carlos@ifsp.edu.br", "Física", "Doutorado", "Mecânica Quântica");
        Funcionario funcionario = new Funcionario("João Almeida", "555.666.777-00", end1, "97777-7777", "joao@biblioteca.com", "Administração");

        aluno.exibirDados();
        professor.exibirDados();
        funcionario.exibirDados();

        Autor autor1 = new Autor("Isaac Newton", "Inglês");
        Autor autor2 = new Autor("Albert Einstein", "Alemão");
        Editora editora = new Editora("Editora Ciência Viva", "São Paulo");

        List<Autor> autoresLivro = new ArrayList<>();
        autoresLivro.add(autor1);
        autoresLivro.add(autor2);

        Livro livro = new Livro("Princípios da Física", "Português", 2020, autoresLivro, editora, "Física Teórica");
        Periodico periodico = new Periodico("Revista Científica Atual", "Português", 2024, List.of(autor2), editora, "Científico");

        livro.exibirInformacoes();
        periodico.exibirInformacoes();
    }
}
