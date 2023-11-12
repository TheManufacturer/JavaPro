import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        // Richiamo Funzione per popolamento
        funzioneHashSet(scan, set);

        // 2) Creazione HashSet e popolazione con il precedente
        HashSet<Integer> setClone = new HashSet<>(set);
        System.out.println("Il setClone contiene " + setClone);

        // 4) Svuotare l'hashset (il setClone), verificarlo e stampare il risultato
        setClone.clear();

        System.out.println("QUI CONTROLLIAMO SE SONO ANCORA UGUALI...");

        funzioneCheckEqualHS(set, setClone);

        System.out.println(setClone);

    }

    // 3) Funzione Check-HashSet Uguali[?]:

    private static void funzioneCheckEqualHS(HashSet<Integer> set, HashSet<Integer> setClone) {

        if (set.equals(setClone)) {
            System.out.println("I due HashSet contengono gli stessi elementi.");

        } else {
            System.out.println("Gli HashSet risultano non uguali.");

        }

    }

    // 1) Funzione: hashset riempito
    private static void funzioneHashSet(Scanner scan, HashSet<Integer> set) {

        System.out.println("Quanti elementi vuoi inserire? (Lavoriamo con Numeri)");
        int grandezza = Integer.parseInt(scan.next());

        // Qui popoliamo il nostro HashSet set...

        for (int i = 0; i < grandezza; i++) {

            System.out.println("Inserisci il " + (i + 1) + " numero:");
            set.add(Integer.parseInt(scan.next()));

        }

        System.out.println("La grandezza del nostro HashSet 'set' è : " + set.size());
        System.out.println("Il nostro set contiene : " + set);
    }
}

/*
 * 1) Scrivere una funzione che restituisca un hashset riempito
 * 
 * 2) Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
 * 
 * 3) Scorrere il set, per ogni elemento verificare se è uguale all'oggetto
 * creato ed eliminarlo
 * 
 * 4) Svuotare l'hashset, verificarlo e stampare il risultato
 */