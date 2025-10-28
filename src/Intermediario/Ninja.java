package Intermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void SharinganAtivado(){
        System.out.println("O charingan ativou");
    }

    public String boasVindasMeuNomeE(){
        return "Olá, meu nome é " + nome;
    }

    public int anosParaSerHokage(int idadeMinima){
        return idadeMinima - idade;
    }
}
