package nivelIntermediario.Classes;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 20;
        Naruto.nomeDoNinja();
        Naruto.ataque();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 21;
        Sasuke.ataqueForte();
    }
}
