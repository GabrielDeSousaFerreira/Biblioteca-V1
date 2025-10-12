import java.util.*;

public class AcervoBiblioteca implements Interface{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<Livro>();
    private Usuario usu;
    private Livro livroSelecionado;

    public AcervoBiblioteca(){
        livros.add(new Livro("Diario de um Banana vol 1","Jeff Kinney"));
        livros.add(new Livro("Diario de um Banana vol 2","Jeff Kinney"));
        livros.add(new Livro("Dom Quixote"," Miguel de Cervantes"));
        livros.add(new Livro("Negrinho do Pastoreiro","João Simões Lopes Neto"));
        livros.add(new Livro("Turma da Mmonica","Mauricio de Souza"));
        livros.add(new Livro("O exorcista","William Peter Blatty"));
        livros.add(new Livro("Amazon sem limites","Steve Jobs"));

        usu = new Usuario(this);
    }

    public ArrayList<Livro> getLivros(){
        return livros;
    }

    public Livro getLivroSelecionado(){
        return livroSelecionado;
    }

    private void biblioteca(){
        System.out.println("\n====== ACERVO DA BIBLIOTECA ======\n");

        for(int i = 0; i < livros.size(); i++){
            System.out.println((i + 1) + " - " + livros.get(i));
        }

        System.out.println("Qual livro deseja escolher para ler?\n");
        int opc = scanner.nextInt();
        scanner.nextLine();

        if (opc < 1 || opc > livros.size()){
            System.out.println("Opção inválida!!!");
            return;
        }

        livroSelecionado = livros.get(opc - 1);
        System.out.println("Você está lendo: " + livroSelecionado);

        System.out.println("\nDeseja alugar o livro que está lendo? (S/N)");
        char escolha = scanner.nextLine().toUpperCase().charAt(0);

        if (escolha == 'S'){
            usu.abrirUsuarioComum(livroSelecionado);
        } else{
            System.out.println("Voltando ao menu...\n");
        }

    }

    @Override
    public void abrirAcervo() {
        this.biblioteca();
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
    public void abrirAluguelDireto() {
        //NÃO FARÁ NADA AQUI
    }
}
