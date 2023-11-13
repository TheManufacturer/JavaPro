import java.util.LinkedList;
import Package.Fruit;

public class Main{

    public static void main(String[] args) {
        LinkedList<Fruit> list = new LinkedList<>();

        list.add(new Fruit("Banana"));
        list.add(new Fruit("Mango"));
        list.add(new Fruit("Kiwi"));
        list.add(new Fruit("Mela"));
        list.add(new Fruit("Pera"));
        
        //Stampiamo attraverso il ciclo

        for(Fruit listFruit : list){
            listFruit.printInfo();
        }

        //aggiungiamo all'inizio
        list.addFirst(new Fruit("Fico"));

        //aggiungiamo alla fine
        list.addLast(new Fruit("Ananas"));

        //Ristampiamo per vedere il risultato
        
        for(Fruit listFruit : list){
            listFruit.printInfo();
        }

    }

}




/*
 * Creare una classe Fruit che accenti nel costruttore il parametro name (String)
 * 
 * In questa classe avere i metodi pubblici per ottenere le informazioni.
 * 
 * Creare un LinkedList con elementi e stamparlo in console.
 * 
 * Aggiungere un elemento al primo posto della lista e uno all'ultimo
 * 
 * Stampare la collezione aggiornata
 */