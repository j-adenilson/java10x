package Condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um peronagem: ");
        System.out.println("1- Naruto Uzuaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        int  escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Você escolheu a opção: " + escolha + " - Naruto Uzumaki");
            break;
            case 2:
                System.out.println("Você escolheu  opção: "  + escolha + " - Sasuke Uchiha");
            break;
            case 3:
                System.out.println("Você escolheu  opção: "  + escolha +  "  - Sakura Haruno");
            break;
            default:
                System.out.println("Escolha inválida");
            break;
        }

        sc.close();
    }
}
