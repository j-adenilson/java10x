package Desafio03;

public class Ninja {
    String nome;
    String nivelDeDificuldade;
    String statusDaMissao;
    String missao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);
    }
}
