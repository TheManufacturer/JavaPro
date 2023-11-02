import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a;
        boolean isValidInput = false;

        do {
            try {

                System.out.print("Inserisci un carattere: ");
                a = scanner.nextLine().charAt(0);

                if (Character.isDigit(a)) {

                    System.out.println("Hai inserito un carattere numerico: " + a);
                    isValidInput = true;

                } else {

                    System.out.println("Errore: Il carattere inserito non è un numero. Riprova. --> " + a);

                }

            } catch (StringIndexOutOfBoundsException e) {

                System.out.println("Errore: Non hai inserito un carattere. Riprova.");

            }

        } while (!isValidInput);

        scanner.close();
    }
}


/*
 * Scrivere una funzione che controlli se un carattere è un numero altrimenti
 * lanciare una eccezione.
 */