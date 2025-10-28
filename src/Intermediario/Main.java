package Intermediario;

public class Main {
    public static void main (String[] args){


        //Ninja 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 30;
        Naruto.ataqueBasico();
        Naruto.ataqueEspecial();
        Naruto.ModoSenninAtivado();

        //Ninja 2
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();
        Sasuke.ataqueBasico();
        Sasuke.ataqueEspecial();
    }
}
