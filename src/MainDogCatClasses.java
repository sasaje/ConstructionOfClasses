import java.util.Scanner;

/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 29/09/2020
 */

public class MainDogCatClasses {

    public static void main(String[] args) {
        Dog firstDog = new Dog("Luna", "Labrador", "black", 7, true);
        Dog secondDog = new Dog("Malou", "Golden Retriever", "Light brown/yellow", 7, true);
        Dog thirdDog = new Dog("Otto", "Bulldog", "White with black dots", 4, true);
        Dog fourthDog = new Dog("Kato", "German shepard", "Brown", 1, false);

        Cat firstCat = new Cat("Mille", "Siameser", "white", 3, true);
        Cat secondCat = new Cat("Fred", "Bengal", "grey", 15, false);
        Cat thirdCat = new Cat("Hugo", "Bobtail", "lightbrown/white", 8, true);

        System.out.println("All class objects are created");
        System.out.println("**********************************");

        Scanner input = new Scanner(System.in);
        String petName = input.next();

        System.out.println("You typed in: " + petName);

        switch (petName){
            case "Luna": System.out.println("Does it got its vaccinations?: " + firstDog.gotItsVaccinations);
                break;
            case "Malou": System.out.println("Does it got its vaccinations?: " + secondDog.gotItsVaccinations);
                break;
            case "Otto": System.out.println("Does it got its vaccinations?: " + thirdDog.gotItsVaccinations);
                break;
            case "Kato": System.out.println("Does it got its vaccinations?: " + fourthDog.gotItsVaccinations);
                break;
            case "Mille": System.out.println("Does it got its vaccinations?: " + firstCat.gotItsVaccinations);
                break;
            case "Fred": System.out.println("Does it got its vaccinations?: " + secondCat.gotItsVaccinations);
                break;
            case "Hugo": System.out.println("Does it got its vaccinations?: " + thirdCat.gotItsVaccinations);
                break;
            default:
                System.out.println(petName + " is currently not in the system.");
        }
    }
}
