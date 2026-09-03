import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // =========================
    // LIVROS
    // =========================

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("\n===== LIVROS =====");

        for (int i = 0; i < livros.size(); i++) {

            Livro livro = livros.get(i);

            System.out.println("\nLivro " + (i + 1));
            livro.exibirInformacoes();
        }
    }

    public Livro buscarLivro(String titulo) {

        for (Livro livro : livros) {

            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }

        return null;
    }

    public void emprestarLivro(String titulo) {

        Livro livro = buscarLivro(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Esse livro já está emprestado.");
            return;
        }

        livro.emprestar();

        System.out.println("Livro emprestado com sucesso!");
    }

    public void devolverLivro(String titulo) {

        Livro livro = buscarLivro(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        if (livro.isDisponivel()) {
            System.out.println("Esse livro já está disponível.");
            return;
        }

        livro.devolver();

        System.out.println("Livro devolvido com sucesso!");
    }

    // =========================
    // USUÁRIOS
    // =========================

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        System.out.println("\n===== USUÁRIOS =====");

        for (Usuario usuario : usuarios) {

            System.out.println();

            usuario.exibirInformacoes();
        }
    }

    public Usuario buscarUsuario(int id) {

        for (Usuario usuario : usuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }
}