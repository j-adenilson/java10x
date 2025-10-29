package Intermediario;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial(){

        System.out.println(nome + " ataque de fogo");
    }

    @Override
    public void estrategiaDeBatalha(){

        System.out.println(nome + " essa é minha estrategia Uchiha");
    }
}
