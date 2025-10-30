package Intermediario;

public class Main {
    public static void main (String[] args){

        System.out.println("==========Naruto Uzuaki=========");
        Uzumaki Naruto = new Uzumaki("Naruto", "Konoha", 18, 30, 1.75);
        System.out.println(Naruto.getNome());
        Naruto.setNome("Naruto Uzumaki");
        System.out.println(Naruto.getNome());



        System.out.println("==========Sasuke Uchiha=========");

    }
}
