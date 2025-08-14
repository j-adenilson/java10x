package nivelIntermediario.Construtores;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;

    //construtor sem argumentos
    public Hokage(){
    }

    //construtor com todos os argumentos
    public Hokage(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
