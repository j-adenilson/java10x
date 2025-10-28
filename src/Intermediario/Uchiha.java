package Intermediario;

public class Uchiha extends Ninja {

    public void SharinganAtivado(){
        System.out.println(nome + " O charingan ativou, eu sou um Uchiha");
    }

    @Override
    public void ataqueEspecial(){
        System.out.println(nome + " Ataque Chidori");
    }
}
