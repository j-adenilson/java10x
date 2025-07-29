package Desafio02;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroMax = 10;
        String[] ninjas = new String[numeroMax];

        int cadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    if(cadastrados < numeroMax){
                        System.out.println("Digite o nome do ninja para cadastro");
                        String nomeNinja = sc.nextLine();
                        ninjas[cadastrados] = nomeNinja;
                        cadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else{
                        System.out.println("A lista de ninjas esta completa");
                    }
                    break;

                case 2:
                    if(cadastrados == 0){
                        System.out.println("nenhum ninja encontrado");
                    } else {
                        System.out.println("============== Lista de ninjas ==============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encarrando o programa...");
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }

        }


        sc.close();
    }
}
