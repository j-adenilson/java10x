package arraysGarbageCollecttor;

public class ArraysGarbageCollecttor {
    public static void main(String[] args) {

            String[] ninja = new String[5];
            ninja[0] = "Naruto Uzumaki";
            ninja[1] = "Sasuke Uchiha";
            ninja[2] = "Sakura Haruno";

        for (int i = 0; i < 5; i++) {
            System.out.println(ninja[i]);
        }
        }
}

