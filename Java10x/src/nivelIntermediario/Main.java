package nivelIntermediario;

public class Main {
    public static void main(String[] args) {

//        String nome = "Naruto";
//        int idade = 16;
//        String aldeia = "Aldeia da folha";

        //criando objeto

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da folha";


        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.SharinganAtivado();
        String boasVindas = Sasuke.BoasVindas();
        System.out.println(boasVindas);
        int quantoFalta = Sasuke.anosParaSerHokage(50);
        System.out.println("vc tem " + Sasuke.idade + " Falta " + quantoFalta + " anos" );

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.aldeia = "Aldeia da folha";

    }
}
