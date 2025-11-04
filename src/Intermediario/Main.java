package Intermediario;

import java.util.*;

public class Main {
    public static void main (String[] args) {

    String[] aray = new String[5];
    ArrayList<String> arrayList =new ArrayList<>();
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Naruto");
    linkedList.add("Sasuke");
    linkedList.add("Sakura");

    System.out.println(linkedList);
    linkedList.add(1, "kakashi");
    System.out.println(linkedList);




    }

}
