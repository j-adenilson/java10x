package ScannerDeusuario;
import java.util.Scanner;

public class ScannerDeusuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);

        sc.close();

        if (idade <= 17){
            System.out.println("menor de idade");
        }else {
            System.out.println("maior de idade");
        }

    }
}
