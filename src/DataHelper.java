import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {
        Random rand = new Random();
        size=20;
        ArrayList<Integer> numeriRandom = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int numeroRandom = rand.nextInt(11);
            numeriRandom.add(numeroRandom);
        }
        return List.of();
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max

    public static int getRandomInteger(int size, int max) {
        size= 20;
         max = 10;
        ArrayList<Integer> interiRandom = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int numeroRandom = rand.nextInt(max + 1);
            interiRandom.add(numeroRandom);
        }
        return size;
    }


    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        size= 20;
         min = 1;
         max = 10;
        ArrayList<Integer> interiRandom = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int numeriRandom = rand.nextInt(max - min + 1) + min;
            interiRandom.add(numeriRandom);
        }
        return List.of();
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    // public static ??? getRandomUniqueInteger(int size) {
    //
    // return null;
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    // public static ??? getRandomUniqueInteger(int size, int max) {
    //
    // return null;
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    // public static ??? getRandomUniqueInteger(int size, int min, int max) {
    //
    // return null;
    // }

    // restituisce una mappa di frequenza di numeri interi
    // public static ??? getFrequencyMap(List<Integer> list) {
    //
    // return null;
    // }

}
