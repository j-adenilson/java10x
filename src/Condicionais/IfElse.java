package Condicionais;

public class IfElse {
    public static void main(String[] args) {
        String nome = "Naruto Usumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;
        String rank;

        if(numeroDeMissoes <= 10){
            System.out.println(nome + " Não está pronto para passar de nível");
        } else if (numeroDeMissoes >= 11 || numeroDeMissoes <=30 ){
            System.out.println(nome + " Está pronto para ser chunin");
        } else if (numeroDeMissoes >= 31 || numeroDeMissoes <= 40) {
            System.out.println(nome + " Está pronto para ser Jounin");
        } else if (numeroDeMissoes > 41 ) {
            System.out.println(nome + " Está pronto para ser da Anbu");
        }else {
            System.out.println("número de missoes invalidos");
        }


    }
}
