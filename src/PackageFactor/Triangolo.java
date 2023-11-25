public class Triangolo implements Shape {
    private String nome;
    private int numLati;

    public Triangolo(String nome, int numLati) {
        this.nome = nome;
        this.numLati = numLati;
    }

    @Override
    public void draw() {
        System.out.println("E' un " + nome + " ed ha : " + numLati + " lati.");
    }
    
}
