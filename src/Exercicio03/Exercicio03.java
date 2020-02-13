package Exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A garota que roubava livros","Bill", 189);
        Livro livro2 = new Livro("O livros","Cosme", 39);
        Livro livro3 = new Livro("Roubava de livros","Shant", 392);

        livro1.setAutor("damiao");
        System.out.println(livro1.getAutor());
    }
}
