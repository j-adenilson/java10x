package Intermediario;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOunao;

    public abstract void sabedoriaHokage();

    public Hokages(){

    }

    public Hokages(String nome, int idade, boolean vivoOunao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOunao = vivoOunao;
    }
}
