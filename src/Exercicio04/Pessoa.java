package Exercicio04;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void exibirDados (){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cidade);
    }
}
