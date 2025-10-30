package Intermediario;

public class Main {
    public static void main (String[] args){

        Uzumaki Naruto = new Uzumaki("Naruto", "konoha", 16);
        System.out.println(Naruto);
        Naruto.tacarKunai();

        System.out.println("=======================");

        Uchiha Sasuke = new Uchiha("Sasuke","konoha", 17);
        System.out.println(Sasuke);
        Sasuke.tacarKunai();

    }
}
