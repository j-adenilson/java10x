package Intermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //TODO: incluindo novos atributos (numero de missoes / rank)
    int numeroDeMissoes;
    Rank nivelNinja;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //sobrecarga de construtor
    public Ninja(int numeroDeMissoes, Rank nivelNinja) {
        this.numeroDeMissoes = numeroDeMissoes;
        this.nivelNinja = nivelNinja;
    }


    public abstract void habilidadeEspecial();

    public void ataqueNormal(){

        System.out.println(nome + " Ataque normal");
    }

    final void tacarKunai(){
        System.out.println("tacar kunai " + nome);
    }

    @Override
    public String toString() {
        return "Ola " + nome;
    }
}
