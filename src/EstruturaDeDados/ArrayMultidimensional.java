package EstruturaDeDados;

public class ArrayMultidimensional {
    public static void main(String[] args){

        String[][] ninjasEAldeias = new String[2][2];

        ninjasEAldeias[0][0] = "Naruto Uzumaki";
        ninjasEAldeias[0][1] = "Aldeia da folha";

        ninjasEAldeias[1][0] = "Gaara";
        ninjasEAldeias[1][1] = "Aldeia do deserto";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][0]);
        }



    }
}
