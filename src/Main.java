import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero da dividere... ");

        int numero = scanner.nextInt();

        divisione(numero);
        scanner.close();

    }

    private static void divisione(int num) {

        try {

            int denomin = 0; // qui mettiamo [zero -->0] per causare l'errore,volendo possiamo gestire anche
                             // questo

            int divisione = num / denomin;

            System.out.println(divisione);

        } catch (java.lang.ArithmeticException e) {
            System.out.println("divisione per zero non fattibile");

        }
    }
}

/*
 * Scrivere una funzione che provi a dividere un numero per 0 e catturi
 * l'eccezione leggendone il messaggio.
 */