package Intermediario;

public class Main {
    public static void main (String[] args){

        //Ninja 1
        String nome = "Naruto Uzumaki";
        String aldeia = "ALdeia da folha";
        int idade = 30;

        //Ninja 2
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 30;
        String boasVindas = Naruto.boasVindasMeuNomeE();
        System.out.println(boasVindas);
        int qtFalta = Naruto.anosParaSerHokage(60);
        System.out.println("faltam " + qtFalta + " anos");

        //Ninja 3
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();
    }
}
