import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v1 = new Vector();

        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add("Apple");
        v1.add("Banana");
        v1.add("Grapes");
        v1.add("Strawberry");

        System.out.println("Vector Before Removing the Element: " + v1);

        v1.remove("Grapes");

        System.out.println("After Removing the Element: " + v1);
    }
}
