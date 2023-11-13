package Package;

public class Fruit {

    private String name;

    public Fruit(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }        
 
    public void printInfo() {
        System.out.println("Nome : " + name);        
    }
}
