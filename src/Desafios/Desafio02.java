package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numeroMax = 10;
        String[] ninjas = new String[numeroMax];
        int ninjasCadastrados = 0;
        int opcoes = 0;




        while (opcoes != 4){

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes){

//                case 1:
//                    if (ninjasCadastrados < numeroMax){
//                        System.out.println("Digite o nome do ninja: ");
//                        String nomeNinja = sc.nextLine();
//
//                        ninjas[ninjasCadastrados] = nomeNinja;
//                        ninjasCadastrados ++;
//                        System.out.println("Ninja cadastrado com sucesso!");
//                    }else {
//                        System.out.println("Lista está completa");
//                    }
//                    break;

                    //===================================================

                case 1:
                    if (ninjasCadastrados < numeroMax) {
                        System.out.print("Digite o nome do ninja: ");
                        String nomeNinja = sc.nextLine();

                        //  Validação de nome duplicado
                        boolean jaExiste = false;
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            if (ninjas[i].equalsIgnoreCase(nomeNinja)) {
                                jaExiste = true;
                                break;
                            }
                        }

                        if (jaExiste) {
                            System.out.println(" Este ninja já foi cadastrado!");
                        } else {
                            ninjas[ninjasCadastrados] = nomeNinja;
                            ninjasCadastrados++;
                            System.out.println(" Ninja cadastrado com sucesso!");
                        }

                    } else {
                        System.out.println(" Lista está completa!");
                    }
                    break;
                //=================================================
                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado");
                    }else {
                        System.out.println("===== Lista de ninjas =====");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                    //==========================================================

                case 3:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja para deletar.");
                        break;
                    }

                    System.out.print("Digite o nome do ninja que deseja deletar: ");
                    String deletar = sc.nextLine();
                    boolean encontrado = false;

                    // procura o ninja pelo nome
                    for (int i = 0; i < ninjasCadastrados; i++) {
                        if (ninjas[i].equalsIgnoreCase(deletar)) {
                            // move todos os próximos elementos uma posição para trás
                            for (int j = i; j < ninjasCadastrados - 1; j++) {
                                ninjas[j] = ninjas[j + 1];
                            }
                            ninjasCadastrados--; // diminui o total
                            ninjas[ninjasCadastrados] = null; // limpa o último espaço
                            encontrado = true;
                            System.out.println("Ninja \"" + deletar + "\" deletado com sucesso!");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Ninja não encontrado!");
                    }
                    break;

                    //===========================================================
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }





        sc.close();
    }
}
