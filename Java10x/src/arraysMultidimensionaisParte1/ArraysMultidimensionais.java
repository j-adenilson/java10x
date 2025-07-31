package arraysMultidimensionaisParte1;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias[0][0] = "Naruto";
        ninjasEAldeias[0][1] = "Konoha";
        ninjasEAldeias[0][2] = "Genin";

        ninjasEAldeias[1][0] = "Sasuke";
        ninjasEAldeias[1][1] = "Konoha";
        ninjasEAldeias[2][2] = "Genin";

        ninjasEAldeias[2][0] = "Sakura";
        ninjasEAldeias[2][1] = "Konoha";
        ninjasEAldeias[2][2] = "Genin";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][2]);

        }


    }
}
