package Intermediario;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main (String[] args) {

    //Array
    //São estaticos e tem referencia de memmoria
        String[] ninjasArray = new String[2];
        ninjasArray[0] = "Naruto";  //adicionando item

    //Listas
    // São dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("naruto"); //adicionando item

    //Stack
    //O ultimmo elemento que entrou vai ser obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.add("Naruto");  //adicionando item
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");
        System.out.println(ninjasStack);
        ninjasStack.pop();  //removendo item
        System.out.println(ninjasStack);

    }
}
