Biblioteca V1

Projeto de biblioteca simples, com opção de aluguel de livros para uma entrada e saida de dados, com opção de criar conta.

Funcionalidades:
- Listar catálogo de livros  
- Cadastrar usuários 
- Alugar livros  
- Ver livros alugados por usuário  

Estrutura do projeto:
- Main.java – ponto de entrada  
- Menu.java – interface de interação / opções  
- Livro.java – define título, autor, status
- Usuario.java – representa usuário com lista de livros  
- AcervoBiblioteca.java – lógica de gerenciamento do acervo

Tecnologias usadas:
- JDK 17 
- Uso de `Scanner` para entrada de dados  
- `ArrayList` para armazenar coleções de objetos  

Como executar:
```bash
git clone https://github.com/GabrielDeSousaFerreira/Biblioteca-V1.git
cd Biblioteca-V1/src
javac *.java
java Main
