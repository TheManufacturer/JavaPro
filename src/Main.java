import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal(12.65);
        BigDecimal numero2 = new BigDecimal(5.35);

        metodoWorkEnum(numero1, numero2, Operazioni.ADDIZIONE);
        metodoWorkEnum(numero1, numero2, Operazioni.SOTTRAZIONE);
        metodoWorkEnum(numero1, numero2, Operazioni.DIVISIONE);
        metodoWorkEnum(numero1, numero2, Operazioni.MOLTIPLICAZIONE);
        metodoWorkEnum(numero1, numero2, Operazioni.MIN);
        metodoWorkEnum(numero1, numero2, Operazioni.MAX);
    }

    public static void metodoWorkEnum(BigDecimal numero1, BigDecimal numero2, Operazioni operazioni) {
        switch (operazioni) {
            case ADDIZIONE:
                System.out.println("La somma è uguale : " + numero1.add(numero2));
                break;
            case SOTTRAZIONE:
                System.out.println("La differenza è uguale : " + numero1.subtract(numero2));
                break;
            case MOLTIPLICAZIONE:
                System.out.println("Il  prodotto è : " + numero1.multiply(numero2));
                break;
            case DIVISIONE:
                System.out.println("Il quoziente è : " + numero1.divide(numero2,2,RoundingMode.CEILING));
                break;
            case MAX:
                System.out.println("Il max è : " + numero1.max(numero2));
                break;
            case MIN:
                System.out.println("Il min è : " + numero2.min(numero2));
                break;
        }
    }
}
/*
 * Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
 * (Addizione, sottrazione, moltiplicazione e divisione, min e max)
 * definita in un enum, crei un metodo per calcolare l'operazione richiesta e
 * ritorni il
 * risultato.
 * 
 * Il tipo di operazione, i due dati in input e il risultato dovranno essere
 * stampati a schermo
 */