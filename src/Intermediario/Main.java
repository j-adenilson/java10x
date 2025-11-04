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

    Set<String> ninjasSet = new HashSet<>();
    ninjasSet.addAll(ninjas);
    System.out.println("NinjasSet: " + ninjasSet);
    ninjasSet.remove("Sasuke");
        System.out.println(ninjasSet);



    }

}
