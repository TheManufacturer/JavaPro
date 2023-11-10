// import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        int a = 78;
        int b = 37;
        char firstChar = 'c';
        Integer aa = 53;
        Integer bb = 47;
        Character firststst = 'D';

        // Scrivere un un valore primitivo per int, double e char e fare autoboxing
        int valInt = 27;
        double valDouble = 7.5;
        char valChar = 'b';

        // Autoboxing delle variabili precedenti + stampa
        Integer valInteger = valInt;
        System.out.println("Autoboxing Integer " + valInteger);

        Double valDoubleger = valDouble;
        System.out.println("Autoboxing Double " + valDoubleger);

        Character valCharacter = valChar;
        System.out.println("Autoboxing Character " + valCharacter);

        // Scrivere un oggetto per Integer, Double e Character e fare Unboxing + stampa

        Integer valIntegerSecond = 35;
        System.out.println(valIntegerSecond.intValue());

        Double valDoublegerSecond = 35.9;
        System.out.println(valDoublegerSecond.doubleValue());

        Character valCharacterSecond = 'b';
        System.out.println(valCharacterSecond.charValue());

        // Chiamata dei metodi esercizio
        function1(a, b);
        function2(firstChar);
        function3(aa, bb);
        function4(firststst);

    }

    // Scrivere una funzione che accetti in input 2 int e ne stampi la somma
    private static void function1(int a, int b) {
        int somma = a + b;
        System.out.println("La somma con il primo metodo (int) --> " + somma);

    }

    // Scrivere una funzione che accetti in input 1 char lo stampi
    private static void function2(char firstChar) {
        System.out.println("La stampa del 2 metodo (char) --> " + firstChar);

    }

    // Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
    private static void function3(Integer aa, Integer bb) {
        int somma1 = aa + bb;
        System.out.println("La somma con il terzo metodo (Integer) --> " + somma1);

    }

    // Scrivere una funzione che accetti in input 1 Character lo stampi
    private static void function4(Character firststst) {
        System.out.println(firststst);
    }

}

/*
 * Scrivere una funzione che accetti in input 2 int e ne stampi la somma
 * Scrivere una funzione che accetti in input 1 char lo stampi
 * Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
 * Scrivere una funzione che accetti in input 1 Character lo stampi
 * 
 * Scrivere un un valore primitivo per int, double e char e fare autoboxing
 * 
 * Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 * 
 * Usare le funzioni scritte con i valori creati
 */