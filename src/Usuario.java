import java.util.*;

public class Usuario implements Interface{
    Scanner scanner =  new Scanner(System.in);
    private Alugar aluga;
    private String nome, cpf, email;

    public Usuario(AcervoBiblioteca acervo){
        this.aluga = new Alugar(acervo);
    }

    public String getNome(){
        return nome;
    }

    private void cadastroUsuariodireto(){
        System.out.println("****** CADASTRO DE USUARIO ******");
        System.out.println("\nDigite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("\nCadastro realizado com sucesso");
        System.out.println("Bem vindo "+nome+"!");

        System.out.println("\nDeseja continuar com o aluguel do livro? (S/N)");
        char opc = scanner.nextLine().toUpperCase().charAt(0);

        if (opc == 'S'){
            aluga.abrirAluguelDireto();
        } else {
            System.out.println("Voltando ao menu...");
        }
    }

    private void cadastroUsuarioComum(Livro livroSelecionado){
        System.out.println("****** CADASTRO DE USUARIO ******");
        System.out.println("\nDigite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("\nCadastro realizado com sucesso");
        System.out.println("Bem vindo "+nome+"!");

        System.out.println("\nDeseja continuar com o aluguel do livro? (S/N)");
        char opc = scanner.nextLine().toUpperCase().charAt(0);

        if (opc == 'S'){
            aluga.aluguelLivrosComum(livroSelecionado);
        } else {
            System.out.println("Voltando ao menu...");
        }
    }

    @Override
    public void abrirUsuarioDireto() {
        this.cadastroUsuariodireto();
    }

    public void abrirUsuarioComum(Livro livroSelecionado) {
        this.cadastroUsuarioComum(livroSelecionado);
    }

    @Override
    public void abrirMenu() {
        //NÃO FARÁ NADA AQUI
    }

    @Override
    public void abrirAcervo() {
        //NÃO FARÁ NADA AQUI
    }

    @Override
    public void abrirAluguelDireto() {
        //NÃO FARÁ NADA AQUI
    }
}
