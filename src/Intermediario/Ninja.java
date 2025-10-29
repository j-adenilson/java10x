package Intermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public abstract void habilidadeEspecial();

    public void ataqueNormal(){
        System.out.println(nome + " Ataque normal");
    }



}
