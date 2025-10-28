package Desafios.Desafios003;

public class Uchiha extends Ninja {
 String habilidadeEspecial;

 public void mostrarHabilidadeEspecial(){
     System.out.println("Habilidade Especial: " + habilidadeEspecial);
 }
 @Override
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("status da issao: " + statusDamissao);
        System.out.println("idade: " + idade);
    }
}
