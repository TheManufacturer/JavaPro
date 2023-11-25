public class Main {
    public static void main(String[] args) {

        BuilderPersona personaBuilder1 = new BuilderPersona("Tobi", "SiLui");
        personaBuilder1.setEta(16);

        BuilderPersona personaBuilder2 = new BuilderPersona("Gon", "QuelloDiHxH");
        personaBuilder2.setEta(30);
        personaBuilder2.setIndirizzo("Foglia");

        Persona persona1 = personaBuilder1.buildPersona();
        Persona persona2 = personaBuilder2.buildPersona();

        System.out.println("\n persona1 : " + persona1);
        System.out.println("\n persona2 : " + persona2);
        System.out.println("\n");
    } 
}

/*
 * Crea una classe Persona con i campi firstName, lastName, age e address, i
 * getter and i setter
 * 
 * Il costruttore accetterà un Builder in input
 * 
 * Creare una classe Builder che attraverso il costruttore e dei metodi
 * specifici (tranne nome e cognome, gli altri campi sono opzionali) per
 * costruire l'oggetto Persona.
 * 
 * Creare due oggetti Person e stamparli a video
 */