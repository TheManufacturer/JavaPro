package Package;

// import java.util.ArrayList;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Nome : " + name + " età : " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /* 
    public static void listEmpty(ArrayList<Student> list) {

        if (list.isEmpty()) {
            System.out.println("La lista risulta essere vuota...");

        } else {

            for (Student listSt : list) {
                listSt.printInfo();

            }
        }
    }
 */

}
