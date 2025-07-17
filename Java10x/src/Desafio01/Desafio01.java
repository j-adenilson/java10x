package Desafio01;

public class Desafio01 {
    public static void main(String[] args) {

        //NINJA01
        String nome1 = "Naruto Uzumaki";
        int idade1 = 10;
        String missao1 = "Passear com cachorros";
        char nivelMissao1 = 'D';
        String statusMissao1 = "Em andamento";

        if(idade1 < 15){
            if(nivelMissao1 == 'C' || nivelMissao1 =='D'){
                statusMissao1 = "Concluida";
            }else {
                statusMissao1 = "Não concluida";
            }
        }else {
            statusMissao1 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nome1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Status da missão: " + statusMissao1);
        System.out.println("nivel da missão: " + nivelMissao1);
        System.out.println("==================================");




        //NINJA02
        String nome2 = "Sasuke uchiha";
        int idade2 = 17;
        String missao2 = "Treinar Jutsu Bola de fogo";
        char nivelMissao2 = 'A';
        String statusMissao2 = "Concluido";

        if(idade2 < 15){
            if(nivelMissao2 == 'C' || nivelMissao2 =='D'){
                statusMissao2 = "Concluida";
            }else {
                statusMissao2 = "Não concluida";
            }
        }else {
            statusMissao2 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nome2);
        System.out.println("Idade do ninja: : " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da missão: " + statusMissao2);
        System.out.println("nivel da missão: " + nivelMissao2);
        System.out.println("==================================");

        //NINJA03
        String nome3 = "Neji Hyuga";
        int idade3 = 17;
        String missao3 = "Treinar Punhos suave";
        char nivelMissao3 = 'A';
        String statusMissao3 = "Concluido";

        if(idade3 < 15){
            if(nivelMissao3 == 'C' || nivelMissao3 =='D'){
                statusMissao3 = "Concluida";
            }else {
                statusMissao3 = "Não concluida";
            }
        }else {
            statusMissao3 = "Concluida";
        }

        System.out.println("Nome do ninja: " + nome3);
        System.out.println("Idade do ninja: : " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da missão: " + statusMissao3);
        System.out.println("nivel da missão: " + nivelMissao3);
        System.out.println("==================================");


    }
}
