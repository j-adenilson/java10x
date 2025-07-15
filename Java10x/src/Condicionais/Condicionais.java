package Condicionais;

public class Condicionais {
    public static void main(String[] args) {
        String nome = "Naruto";
        int idade = 20;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        String rank ;

        if (numeroDeMissoes <= 10 && idade <= 15){
            System.out.println("Rank: chunin");
        } else if (numeroDeMissoes >= 20 && idade >= 20) {
            System.out.println("Rank: Jounin");
        } else{
            System.out.println("Rank: Genin");
        }
    }
}
