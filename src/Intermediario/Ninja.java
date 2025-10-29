package Intermediario;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    public abstract void habilidadeEspecial();

    public void ataqueNormal(){
        System.out.println(nome + " Ataque normal");
    }

}
