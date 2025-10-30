package Intermediario;

public class Main {
    public static void main (String[] args){

        System.out.println("==========Naruto Uzuaki=========");
        Missoes missa1 = new Missoes("Treinar", RankDeMissoes.D);
        missa1.exibirDetalhes();

        Missoes missao2 = new Missoes("Lutar", RankDeMissoes.SSS);
        missao2.exibirDetalhes();



        System.out.println("==========Sasuke Uchiha=========");

    }
}
