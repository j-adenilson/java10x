package Intermediario;

public class Hatake extends Ninja implements SharinganInterface, Anbu{

    public void benvindoAAnbu(){
        System.out.println(nome + " bem-vindo a elite Ninja");
    }

    public void sharinganAtivado(){
        System.out.println(nome + " meu sharingan ativou");
    }

    public void boasVindas(){
        System.out.println(nome + " Olá");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println(nome + " minha habilidade Hatake");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println(nome + " minha estrategia Hatake");
    }

    public Hatake() {
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
