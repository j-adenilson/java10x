package Intermediario;

public class Uchiha extends Ninja {

    @Override
    public void habilidadeEspecial(){

        System.out.println(nome + " ataque de fogo");
    }

    @Override
    public void estrategiaDeBatalha(){
        System.out.println(nome + " essa é minha estrategia Uchiha");
    }
}
