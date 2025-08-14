package nivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Hokage Hashirama = new Hokage();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 35;
        Hashirama.vivoOuNao = false;

        Hokage Tobirama = new Hokage("Tobirama Senju", 30, false);

        Hokage Hiruzen = new Hokage("Hiruzen Sarutobi", 40, false);
    }
}
