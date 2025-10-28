public class Funcionario extends Usuario {
    private String departamento;

    public Funcionario(String nome, String cpf, Endereco endereco, String telefone, String email, String departamento) {
        super(nome, cpf, endereco, telefone, email);
        this.departamento = departamento;
    }

    @Override
    public void exibirDados() {
        System.out.println("Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Departamento: " + departamento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("-------------------------");
    }
}

