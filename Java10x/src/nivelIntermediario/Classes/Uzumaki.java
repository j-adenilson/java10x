package nivelIntermediario.Classes;

public class Uzumaki extends Ninja implements NinjaInterface{
    public void nomeDoNinja(){
        System.out.println("Meu nome é: " + nome);
    }

    public void ataqueForte(){
        System.out.println("Ataque forte");
    }
}
