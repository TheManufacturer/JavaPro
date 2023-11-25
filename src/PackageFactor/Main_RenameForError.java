package PackageFactor;

public class Main_RenameForError {
    public static void main(String[] args) { 
        Shape cerchio = Factory.getShape(Enum1.CERCHIO);
        cerchio.draw();
        Shape quadrato = Factory.getShape(Enum1.QUADRATO);
        quadrato.draw();
        Shape triangolo = Factory.getShape(Enum1.TRIANGOLO);
        triangolo.draw();
    }

}

/*
 * Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che
 * implementino Shape.
 * 
 * Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio,
 * rettangolo etc etc)
 * 
 * Crea una factory class che abbia un metodo che ritorni la forma corretta
 * (shape) in base all'enum in input.
 * 
 * Stampa a video il risultato della funzione draw di ogni shape creata
 * }
 */