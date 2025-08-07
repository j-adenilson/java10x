package Desafio03;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);

        System.out.println("Habilidade Uchiha");

    }
}
