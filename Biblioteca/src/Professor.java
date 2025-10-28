public class Professor extends Usuario {
    private String departamento;
    private String formacao;
    private String areaAtuacao;

    public Professor(String nome, String cpf, Endereco endereco, String telefone, String email,
                     String departamento, String formacao, String areaAtuacao) {
        super(nome, cpf, endereco, telefone, email);
        this.departamento = departamento;
        this.formacao = formacao;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Departamento: " + departamento);
        System.out.println("Formação: " + formacao);
        System.out.println("Área de Atuação: " + areaAtuacao);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("-------------------------");
    }
}
