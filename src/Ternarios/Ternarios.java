package Ternarios;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Naruto Uzuaki";
        int idade = 16;
        System.out.println("Digite o numero de missoes");
        int numeroDeMissoes = sc.nextInt();

        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja possui mais de 10 missoes" : "Esse Ninja possui menos de 10 missoes";
        System.out.println(nivel);

    }
}
