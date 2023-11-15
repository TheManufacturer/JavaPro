import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(2, "b");
        hashMap1.put(1, "a");
        hashMap1.put(3, "c");

        System.out.println("HashMap1 : " + hashMap1);

        Map<Integer, String> hashMap2Imm = Map.of(2, "b", 1, "a", 3, "c");
        System.out.println("HashMap2 Immutabile : " + hashMap2Imm);

        Map<Integer, String> hashMap3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>(1, "a"),
                new AbstractMap.SimpleEntry<>(2, "b"),
                new AbstractMap.SimpleEntry<>(3, "c"));
                
        System.out.println("HashMap3 : " + hashMap3);
    }
}

/*
 * Creare 3 hashmap con 3 differenti metodi di inizializzazione
 *
 * Stampare il contenuto.
 */