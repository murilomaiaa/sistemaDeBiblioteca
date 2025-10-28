public abstract class Usuario {
    protected int id;
    private static int nextId = 1;
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected String telefone;
    protected String email;

    public Usuario(String nome, String cpf, Endereco endereco, String telefone, String email) {
        this.id = Usuario.nextId;
        Usuario.nextId++;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public abstract void exibirDados();
}
