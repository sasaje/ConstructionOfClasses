import java.util.Scanner;

/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 29/09/2020
 */

// Lav 3 forskellige constructors til din Studerende klasse. Den ene skal ikke tage imod parametre,
// den anden skal tage imod navn, alder og by, og den tredje skal tage imod navn og alder.

public class MainStudent {

    public static void main(String[] args) {

        Student studentOne = new Student("Sara", 27,"Næstved");
        Student studentTwo = new Student("Louise", 41,"Glumsø");
        Student studentThree = new Student("Malte", 28,"Nykøbing F.");
        Student studentFour = new Student("Jenna", 36,"Nørre Alslev");
        Student studentFive = new Student("Laila", 49,"Næstved");

        System.out.println("All students initialized!");
        System.out.println("********************************");

        while (true) { // This is an infinity loop
            Scanner scanner = new Scanner(System.in);
            System.out.print("Which student do you want to look up in the database?: ");
            String nameToFind = scanner.next();
            switch (nameToFind) {
                case "Sara":
                    System.out.println(studentOne.studentAge);
                    break;
                case "Louise":
                    System.out.println(studentTwo.studentAge);
                    break;
                case "Malte":
                    System.out.println(studentThree.studentAge);
                    break;
                case "Jenna":
                    System.out.println(studentFour.studentAge);
                    break;
                case "Laila":
                    System.out.println(studentFive.studentAge);
                    break;
                default:
                    System.out.println(nameToFind + " is not in your studentgroup.");
            }
        }
    }
}
