package Intermediario;

public class Uchiha extends Ninja implements SharinganInterface{

    public void SharinganAtivado(){
        System.out.println(getNome() + " Sharingan ativado");
    }
    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, altura);
    }
}
