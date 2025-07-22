package ternarios;

public class Ternarios {
    public static void main(String[] args) {
        String nome = "Naruto";
        int idade = 20;
        boolean hokage = false;
        short numeroDeMissoes = 10;
        String rank ;

        String nivel = (numeroDeMissoes >= 10) ? "Mais de 10 missoes" : "Menos de 10 missoes";
        System.out.println(nivel);
    }
}
