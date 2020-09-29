/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 29/09/2020
 */

public class Dog {
    String name;
    String race;
    String color;
    int age;
    String type;
    boolean gotItsVaccinations;

    public Dog(String name, String race, String color, int age, boolean gotItsVaccinations){
        this.name = name;
        this.race = race;
        this.age = age;
        this.color = color;
        this.gotItsVaccinations = gotItsVaccinations;
    }

        Dog(){
            type = "Pet";
        }
}
