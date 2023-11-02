import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Inserisci un numero intero: ");
                int numero = scanner.nextInt();

                System.out.println("Hai inserito un numero intero: " + numero/0);
                break;

            } catch (ArithmeticException e) {

                System.out.println("Errore: Stai dividendo per zero... Riprova.");
                scanner.next();
            }
        }

        scanner.close();
    }
}

/*
 * 
 * Scrivere una funzione che provi a dividere un numero per 0 e catturi
 * l'eccezione leggendone il messaggio.
 * 
 */
