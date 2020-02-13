package Exercicio03;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePagina;

    public Livro(String titulo, String autor, int numeroDePagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }

    public void setTitulo(String titulo) {
        System.out.println("Impossivel alterar");
    }

    public void setAutor(String autor) {

        System.out.println("Impossivel alterar");
    }

    public void setNumeroDePagina( String numeroDePagina) {
        System.out.println("Impossivel alterar");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }
}
