import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println("       SISTEMA BIBLIOTECA");
            System.out.println("==============================");

            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Cadastrar usuário");
            System.out.println("4 - Listar usuários");
            System.out.println("5 - Emprestar livro");
            System.out.println("6 - Devolver livro");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println("\n===== CADASTRAR LIVRO =====");

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Livro livro = new Livro(
                            titulo,
                            autor,
                            ano
                    );

                    biblioteca.adicionarLivro(livro);

                    break;

                case 2:

                    biblioteca.listarLivros();

                    break;

                case 3:

                    System.out.println("\n===== CADASTRAR USUÁRIO =====");

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Usuario usuario = new Usuario(
                            nome,
                            id
                    );

                    biblioteca.adicionarUsuario(usuario);

                    break;

                case 4:

                    biblioteca.listarUsuarios();

                    break;

                case 5:

                    System.out.println("\n===== EMPRESTAR LIVRO =====");

                    System.out.print("Digite o título do livro: ");
                    String tituloEmprestimo = scanner.nextLine();

                    biblioteca.emprestarLivro(tituloEmprestimo);

                    break;

                case 6:

                    System.out.println("\n===== DEVOLVER LIVRO =====");

                    System.out.print("Digite o título do livro: ");
                    String tituloDevolucao = scanner.nextLine();

                    biblioteca.devolverLivro(tituloDevolucao);

                    break;

                case 0:

                    System.out.println("\nEncerrando sistema...");

                    break;

                default:

                    System.out.println("\nOpção inválida!");

                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}