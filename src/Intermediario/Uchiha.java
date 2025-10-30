package Intermediario;

public class Uchiha extends Ninja implements SharinganInterface{

    public void sharinganAtivado(){
        System.out.println(nome + " Saringan ativado");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(int numeroDeMissoes, Rank nivelNinja) {
        super(numeroDeMissoes, nivelNinja);
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
