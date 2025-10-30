package Intermediario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        //Listas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzuaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Kakashi Hatake");
        System.out.println(ninjasList);

        ninjasList.remove("Kakashi Hatake");
        System.out.println(ninjasList);

        ninjasList.set(2, "Hashirama Senju");
        System.out.println(ninjasList);

        System.out.println("Tamanho da lista: " + ninjasList.size() + " Elementos");


    }
}
