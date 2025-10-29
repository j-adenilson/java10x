package Intermediario;

public class Main {
    public static void main (String[] args){

    Uzumaki Naruto = new Uzumaki();
    Naruto.nome = "Naruto Uzumaki";
    Naruto.habilidadeEspecial();

    Uchiha Sasuke = new Uchiha();
    Sasuke.nome = "Sasuke uchiha";
    Sasuke.habilidadeEspecial();

    Hokages Hasirama = new Hokages("hashirama Senju", 35, false);

    Hokages Tobirama = new Hokages("Tobirama Senju", 30, false);

    System.out.println(Hasirama.nome);
    System.out.println(Tobirama.nome);

    }
}
