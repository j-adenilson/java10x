package EntradaDeDados;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("O nome é: " + nome);

        if(idade >= 18){
            System.out.println("Sua idade é, " + idade + " anos, você é maior de idade");
        }else {
            System.out.println("Sua idade é, " + idade + " anos, você é menor de idade");
        }



        sc.close();


    }
}
