import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hashMap1 = new LinkedHashMap<>();

        hashMap1.put("b", 2);
        hashMap1.put("a", 1);
        hashMap1.put("c", 3);
        hashMap1.put("d", 4);
        hashMap1.put("f", 6);
        hashMap1.put("e", 5);

        System.out.println("HashMap1 prima dell'ordinamento: " + hashMap1);

        // Creare una lista di chiavi ordinate
        List<String> chiaviOrdinate = new ArrayList<>(hashMap1.keySet());
        Collections.sort(chiaviOrdinate);

        // Creare una nuova mappa ordinata basandosi sulle chiavi ordinate
        Map<String, Integer> mappaOrdinata = new LinkedHashMap<>();
        for (String chiave : chiaviOrdinate) {
            mappaOrdinata.put(chiave, hashMap1.get(chiave));
        }

        System.out.println("LinkedHashMap1 dopo l'ordinamento: " + mappaOrdinata);
    }
}
/*
 * Map<Integer, String> hashMap2Imm = Map.of(2, "b", 1, "a", 3, "c");
 * System.out.println("HashMap2 Immutabile : " + hashMap2Imm);
 * 
 * Map<Integer, String> hashMap3 = Map.ofEntries(
 * new AbstractMap.SimpleEntry<>(1, "a"),
 * new AbstractMap.SimpleEntry<>(2, "b"),
 * new AbstractMap.SimpleEntry<>(3, "c"));
 * 
 * System.out.println("HashMap3 : " + hashMap3);
 */

/*
 * Creare un hashmap prendere tutti i valori, ordinarli e stamparli
 */