package nivelIntermediario.Classes;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    public abstract void nomeDoNinja();

    public void ataque(){
        System.out.println("Ataque base");
    }
}
