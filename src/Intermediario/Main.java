package Intermediario;

import java.util.*;

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

        //Queue // Filas
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Tobirama");
        ninjasQueue.add("Hashirama");

        System.out.println("Ninjas na fila " + ninjasQueue);
        ninjasQueue.poll(); //removendo o primeiro item(Head) da fila
        System.out.println("primeiro da fila: " + ninjasQueue.peek()); // ve quem é o primeiro da fila
        ninjasQueue.add("Tsunade"); // adicionando item na lista
        System.out.println(ninjasQueue);
        // nao é posivel deletar o ultimo
        if (ninjasQueue.isEmpty()){
            System.out.println("a fila esta vazia"); // verificando se a fila esta vazia
        }


    }

}
