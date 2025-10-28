import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=== MENU ===");
            System.out.println("0. Sair");
            System.out.println("1. Ver obras");
            System.out.println("2. Adicionar aluno");
            System.out.println("3. Emprestar obra");
            System.out.println("4. Devolver obra");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    List<Obra> obras =  biblioteca.getObras();
                    obras.forEach(Obra::exibirInformacoes);
                    break;
                case 2:
                    System.out.println("\n=== CADASTRAR ALUNO ===");
                    
                    System.out.print("Nome: ");
                    scanner.nextLine(); // consume newline
                    String nome = scanner.nextLine();
                    
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    
                    System.out.println("Endereço:");
                    System.out.print("Rua: ");
                    String rua = scanner.nextLine();
                    
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();
                    
                    System.out.print("Bairro: ");
                    String bairro = scanner.nextLine();
                    
                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();
                    
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();
                    
                    System.out.print("CEP: ");
                    String cep = scanner.nextLine();
                    
                    Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
                    Aluno aluno = new Aluno(nome, cpf, endereco, telefone, email, curso);
                    biblioteca.cadastraAluno(aluno);
                    
                    System.out.print("Aluno cadastrado com sucesso!\n");
                    System.out.println("Id: " + aluno.getId());
                    break;

                case 3:
                    System.out.println("\n=== EMPRESTAR OBRA ===");
                    
                    System.out.println("Usuários cadastrados:");
                    biblioteca.listaUsuarios();
                    
                    System.out.print("Digite o ID do usuário: ");
                    int usuarioId = scanner.nextInt();
                    
                    System.out.println("\nObras disponíveis:");
                    List<Obra> obrasDisponiveis =  biblioteca.listaObrasDisponiveis();

                    if(obrasDisponiveis.isEmpty()) {
                        System.out.println("Nenhuma obra disponível");
                    } else {
                        obrasDisponiveis.forEach(Obra::exibirInformacoes);
                        System.out.print("Digite o ID da obra: ");
                        int obraId = scanner.nextInt();

                        biblioteca.usuarioPegaObraEmprestada(usuarioId, obraId);
                    }
                    break;

                case 4:
                    System.out.println("\n=== DEVOLVER OBRRA ===");
                    List<Obra> obrasEmprestadas = biblioteca.listaObrasEmprestadas();

                    if(obrasEmprestadas.isEmpty()) {
                        System.out.println("Nenhuma obra emprestada");
                    } else {
                        obrasEmprestadas.forEach(Obra::exibirInformacoes);
                        System.out.print("Digite o ID da obra para devolver: ");
                        int obraId = scanner.nextInt();

                        biblioteca.devolveObra(obraId);
                    }
                    break;
            }
        }

    }
}
