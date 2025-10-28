public class Editora {
    private String nome;
    private Endereco endereco;

    public Editora(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome + " - " + endereco.getCidade();
    }
}
