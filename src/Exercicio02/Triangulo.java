package Exercicio02;

public class Triangulo {
    private int base;
    private int altura;
    private int resposta;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        resposta = (base * altura)/2;
        System.out.println(resposta);
    }
}
