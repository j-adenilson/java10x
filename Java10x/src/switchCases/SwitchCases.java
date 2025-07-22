package switchCases;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura haruno");

        int escolha = sc.nextInt();
        System.out.println("Você escolheu o número: " + escolha);

        switch (escolha){
            case 1:
                System.out.println("O usuario escolheo o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu a Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }


        sc.close();
    }
}
