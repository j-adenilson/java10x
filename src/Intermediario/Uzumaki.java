package Intermediario;

public class Uzumaki extends Ninja{

    public void ModoSenninAtivado(){
        System.out.println(nome + " Modo sennin ativado");
    }

    @Override
    public void ataqueEspecial(){
        System.out.println(nome + " Ataque Rasengan");
    }
}
