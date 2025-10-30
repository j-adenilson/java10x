package Intermediario;

public class Uzumaki extends Ninja{

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial(){

        System.out.println(nome + " ataque de ar");
    }

    @Override
    public void estrategiaDeBatalha(){

        System.out.println(nome + " essa é minha estrategia Uzumaki");
    }


}
