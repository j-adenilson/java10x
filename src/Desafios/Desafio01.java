package Desafios;

public class Desafio01 {
    public static void main(String[] args) {

        String ninja1 = "Naruto Uzumaki";
        int idade1 = 15;
        String aldeia1 = "Aldeia da folha";
        String nomeDaMissao1 = "Passear com cachorros";
        char nivelDeDificuldade1 = 'D';
        String statusDaMissao1 = "";

        System.out.println("Nome: " + ninja1 + "\nIdade: " + idade1 + " anos" + "\nAldeia: " + aldeia1 + "\nMissao: " + nomeDaMissao1 + "\nNivel de dificuldade: " + nivelDeDificuldade1);
        if (idade1 < 15 && (nivelDeDificuldade1 != 'C' || nivelDeDificuldade1 != 'D')){
            System.out.println("Idade Não adequada as missoes");
        }else if (idade1 >= 15 && nivelDeDificuldade1 == 'C' || nivelDeDificuldade1 == 'D'){
                System.out.println(statusDaMissao1 = "Missao concluida" );
        }

        System.out.println("===================");

        String ninja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String aldeia2 = "Aldeia da folha";
        String nomeDaMissao2 = "Treinar jutsu katon";
        char nivelDeDificuldade2 = 'A';
        String statusDaMissao2 = "";

        System.out.println("Nome: " + ninja2 + "\nIdade: " + idade2 + " anos" + "\nAldeia: " + aldeia2 + "\nMissao: " + nomeDaMissao2 + "\nNivel de dificuldade: " + nivelDeDificuldade2);
        if (idade2 < 15 && (nivelDeDificuldade1 != 'C' || nivelDeDificuldade1 != 'D')){
            System.out.println("Idade Não adequada as missoes");
        }else if (idade2 >= 15 && nivelDeDificuldade2 == 'C' || nivelDeDificuldade2 == 'D'){
            System.out.println(statusDaMissao2 = "Missao concluida" );
        }else if (idade2 >= 15 && nivelDeDificuldade2 == 'A' || nivelDeDificuldade2 == 'S'){
            System.out.println(statusDaMissao2 = "missao em andamento");
        }

        System.out.println("===================");

        String ninja3 = "Rock Lee";
        int idade3 = 15;
        String aldeia3 = "Aldeia da folha";
        String nomeDaMissao3 = "Treinar taijuts";
        char nivelDeDificuldade3 = 'A';
        String statusDaMissao3 = "";

        System.out.println("Nome: " + ninja3 + "\nIdade: " + idade3 + " anos" + "\nAldeia: " + aldeia3 + "\nMissao: " + nomeDaMissao3 + "\nNivel de dificuldade: " + nivelDeDificuldade3);
        if (idade3 < 15 && (nivelDeDificuldade3 != 'C' || nivelDeDificuldade3 != 'D')){
            System.out.println("Idade Não adequada as missoes");
        }else if (idade3 >= 15 && nivelDeDificuldade3 == 'C' || nivelDeDificuldade3 == 'D'){
            System.out.println(statusDaMissao3 = "Missao concluida" );
        }else if (idade3 >= 15 && nivelDeDificuldade3 == 'A' || nivelDeDificuldade3 == 'S'){
            System.out.println(statusDaMissao3 = "missao em andamento");
        }
    }
}
