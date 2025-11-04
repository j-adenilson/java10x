package Intermediario;

import java.util.*;

public class Main {
    public static void main (String[] args) {

    List<String> ninjas = new ArrayList<>();
    ninjas.add("Naruto");
    ninjas.add("Sasuke");
    ninjas.add("Sakura");
    ninjas.add("Naruto");
    System.out.println("ninjas " + ninjas);

    Set<String> ninjasSet = new HashSet<>(); //Utilizado quando nao quero que apareça item duplicado
    ninjasSet.addAll(ninjas);
    System.out.println("NinjasSet: " + ninjasSet);
    ninjasSet.remove("Sasuke");
    System.out.println(ninjasSet);

    Set<String> ninjasTreeSet = new TreeSet<>(); // Utilizado quando nao quero que apareça ite duplicado e quero que apareçam em ordem alfabetica
    ninjasTreeSet.add("Minato");
    ninjasTreeSet.add("Hasirama");
    ninjasTreeSet.add("Tobirama");
    ninjasTreeSet.add("Aokiji");
    System.out.println("ninjas TreeSet: " + ninjasTreeSet);


        Set<String> ninjasHashSet = new LinkedHashSet<>();//imprime na ordem de implementação
        ninjasHashSet.add("Naruto");
        ninjasHashSet.add("Sasuke");
        ninjasHashSet.add("Sakura");
        System.out.println("ninjas linkedHashSet:" + ninjasHashSet);



    }

}
