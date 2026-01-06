// LesStudenter.java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// 1. Definere en klasse for data fra en datafil om studenter basert på strukturen i data (se oppgavetekst i README.md)
class Student {
    // Skriv kode her

    // Metoden erstatter en eksisterende metode toString() 
    @Override
    public String toString() {
        return "Student{" + .... + "}";
    }

}

// 2. Bruk try-with-resources for sikker filbehandling og les inn data fra fil i en Java datastruktur 
// ved bruk av Scanner, linje for linje, og til slutt skriv ut datafeltene til System.out
public class LesStudenter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(args[0]))) {
            while (scanner.hasNext()) {
                // Bruk scanner.nextLine() for allokere Student-objekt for hver linje i students.csv
                // og skriv ut dataene med den overskrevede toString() metoding i klassen Student
                // ...
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
