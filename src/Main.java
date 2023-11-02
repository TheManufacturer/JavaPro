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
                    System.out.println("Errore: Il carattere inserito non è un numero. Riprova.");
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Errore: Non hai inserito un carattere. Riprova.");
            }
        } while (!isValidInput);

        scanner.close();
    }
}

/*
 * public class Main {
 * public static void main(String[] args){
 * try{
 * char a ='e';
 * isNumber(a);
 * System.out.println(" Il carattere  è un numero.");
 * }catch(NotANumber e ){
 * System.out.println("ERRORE: Il carattere non è un numero.");
 * }
 * }
 * 
 * public static void isNumber (char a) throws NotANumber{
 * if (!Character.isDigit(a)) {
 * throw new NotANumber();
 * }
 * }
 * 
 * }
 * 
 */

/*
 * Scrivere una funzione che controlli se un carattere è un numero altrimenti
 * lanciare una eccezione.
 */