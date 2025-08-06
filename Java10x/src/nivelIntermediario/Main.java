package nivelIntermediario;

public class Main {
    public static void main(String[] args) {

//        String nome = "Naruto";
//        int idade = 16;
//        String aldeia = "Aldeia da folha";

        //criando objeto

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.modoSabio();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.SharinganAtivado();


        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 17;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.ativarCura();

    }
}
