package Intermediario;

public class Main {
    public static void main (String[] args){

        //Ninja 1
        String nome = "Naruto Uzumaki";
        String aldeia = "ALdeia da folha";
        int idade = 16;

        //Ninja 2
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;
        System.out.println(Naruto.nome);

        //Ninja 3
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
    }
}
