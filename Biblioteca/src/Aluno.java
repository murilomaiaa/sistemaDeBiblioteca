public class Aluno extends Usuario {
    private String curso;

    public Aluno(String nome, String cpf, Endereco endereco, String telefone, String email, String curso) {
        super(nome, cpf, endereco, telefone, email);
        this.curso = curso;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno:");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("-------------------------");
    }
}
