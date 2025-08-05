package nivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public void SharinganAtivado(){
        System.out.println("Sharingan ativado");
    }

    public String BoasVindas(){
        return "OLá, seja bem vindo";
    }

    public int anosParaSerHokage(int idadeMinima){
        return idadeMinima - idade;
    }
}
