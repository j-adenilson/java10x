package EstruturaDeDados;

public class GarbageCollecttor {
    public static void main(String[] args){

        String[] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[3] = "Sakura Haruno";
        ninjas[4] = "Rock Lee";

        ninjas = new String[5];
        ninjas[0] = "Hashirama Senju";
        ninjas[1] = "Tobirama Senju";
        ninjas[2] = "Hiruzen Sarutobi";
        ninjas[3] = "Minato Namikaze";
        ninjas[4] = "Tsunade";

        for (int i = 0; i < 5; i++) {
            System.out.println(ninjas[i]);
        }

        /*
        Arrays + Introdução ao Garbage Collecttor🍍
Arrays em Programação
Arrays são estruturas de dados usadas para armazenar múltiplos valores em uma única variável. Cada valor é acessado por um índice numérico, começando do zero.

Por exemplo:

    int[] numeros = {1, 2, 3, 4, 5};
Redeclaração de Arrays
Em muitas linguagens de programação, uma vez que um array é declarado, você pode atribuir novos valores, mas não pode redeclará-lo diretamente sem perder os dados atuais.

Por exemplo, se você tentar redeclarar um array já existente, você irá sobrescrever o array anterior:

    int[] numeros = {1, 2, 3};
    numeros = new int[]{4, 5, 6};
<!-- Redeclaração -->
Introdução ao Garbage Collection
Garbage Collection (GC) é o processo automático de gerenciamento de memória, onde objetos que não estão mais em uso são removidos da memória. Isso ajuda a evitar vazamentos de memória.

O Garbage Collector monitora objetos que não têm mais referências ativas e os limpa da memória.

    // Exemplo de objeto não mais referenciado:
    MinhaClasse obj = new MinhaClasse();
    obj = null;  // O objeto anterior é agora elegível para GC
O Garbage Collection é especialmente importante em linguagens como Java e C#, onde a memória é gerenciada automaticamente.
* */
    }
}
