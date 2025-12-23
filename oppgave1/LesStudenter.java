// LesStudenter.java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// 1. Definere en klasse for data om studenter (Student)
class Student {

    
    @Override
    public String toString() {
        return "Student{" + .... + "}";
    }

}

// 2. Bruk try-with-resources for sikker filbehandling og les inn data fra fil i en Java datastruktur 
// ved bruk av Scanner, linje for linje
public class LesStudenter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                // Bruk scanner.nextLine() for allokere Student-objekter for hver linje i students.csv
                // ...
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
