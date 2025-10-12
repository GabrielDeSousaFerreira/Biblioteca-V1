public class Livro implements Interface{
    private String nome, autor;
    private boolean disponivel;

    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return nome + " - " + autor + (disponivel ? "(DISPONÍVEL)" : "(ALUGADO)");
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

    @Override
    public void abrirAluguelDireto() {
        //NÃO FARÁ NADA AQUI
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
