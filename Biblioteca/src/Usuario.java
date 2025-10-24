public abstract class Usuario {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected String telefone;
    protected String email;

    public Usuario(String nome, String cpf, Endereco endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public abstract void exibirDados();
}
