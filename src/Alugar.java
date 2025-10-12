import java.util.*;

public class Alugar implements Interface{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Livro> livros;
    private AcervoBiblioteca acervo;

    public Alugar(AcervoBiblioteca acervo){
        this.acervo = acervo;
        this.livros = acervo.getLivros();
    }

    private void aluguelLivrosDireto(){
        System.out.println("\n====== ALUGUEL DE LIVROS ======");
        System.out.println("Escolha o livro que queria alugar");

        for(int i = 0; i < livros.size(); i++){
            System.out.println((i + 1) + " - " + livros.get(i));
        }
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 1 || n > livros.size()){
            System.out.println("Livro não encontrado =(");
            return;
        }

        Livro escolhido = livros.get(n - 1);
        escolhido.setDisponivel(false);

        System.out.println("\nLivro alugado: " + livros.get(n - 1).getNome());
        System.out.println("Devolução em até 7 dias, multa de R$2.50 dia atraso!\n\n");
    }

    public void aluguelLivrosComum(Livro livroSelecionado){
        System.out.println("\n====== ALUGUEL DE LIVROS ======");
        System.out.println("Você está alugando o livro: " + livroSelecionado.getNome());
        livroSelecionado.setDisponivel(false);
        System.out.println("Devolução em até 7 dias, multa de R$2.50/dia atraso!\n");
    }

    @Override
    public void abrirAluguelDireto() {
        this.aluguelLivrosDireto();
    }

    @Override
    public void abrirMenu() {
        //NÃO FARÁ NADA AQUI
    }

    @Override
    public void abrirUsuarioDireto() {
        //NÃO FARÁ NADA AQUI
    }

    @Override
    public void abrirAcervo() {
        //NÃO FARÁ NADA AQUI
    }
}
