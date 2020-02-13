package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    private String nome;
    private String cargo;
    private String endereco;
    private int ano;
    private int idade;




    public void inserirDados(String nome1, String cargo1, String endereco1) {
        System.out.println("Seu nome é: " + nome1);
        System.out.println("Seu cargo é: " + cargo1 );
        System.out.println("Seu endereço é: " + endereco1);
    }

    public void calculandoIdade(int ano){
        idade = 2020 - ano;
        System.out.println("Você tem: " + idade + " anos");
    }



}
