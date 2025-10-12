import java.util.*;

public class Menu implements Interface{
    Scanner scanner = new Scanner(System.in);
    private AcervoBiblioteca acervo = new AcervoBiblioteca();
    private Usuario usuario = null;

    private void menu(){
        int n = 0;

        while (n != 3){
            System.out.println("****** BIBLIOTECA SÃO PAULO ******");
            System.out.println("Qual das opções deseja seguir?");
            System.out.println("\n1 - Acervo da biblioteca");
            System.out.println("2 - Alugar um livro");
            System.out.println("3 - Sair");
            n = scanner.nextInt();
            scanner.nextLine();

            switch (n){
                case 1 -> acervo.abrirAcervo();
                case 2 -> {
                    if (usuario == null) usuario = new Usuario(acervo);
                    usuario.abrirUsuarioDireto();
                }
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Comando invalido");
            }
        }
    }

    @Override
    public void abrirMenu() {
        this.menu();
    }

    @Override
    public void abrirUsuarioDireto() {
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
