import java.time.Year;

/** Class: Cat.java
 * @author Eden Truong
 * @version 1.0
 * Written: Jan 17, 2024
 *
 * This class takes in name, breed, num legs, and Year Born, futhermore also gets stage of life and years old
*/

public class Cat {
    public String name;
    public String breed;
    public int numOfLegs;
    public int yearBorn;

    public Cat(String name, String breed, int yearBorn) {
        this.name = name;
        this.breed = breed;
        this.numOfLegs = 4;
        this.yearBorn = yearBorn;
    }

    public int findAge() {
        Year year = Year.now();
        return year.getValue() - getYearBorn(); //get value converts time.year obj to int which is cool
    }

    public String getStageOfLife() {
        int age = findAge();
        if (age <= 1) {
            return "baby";
        }
        else if (age < 5) {
            return "juvenile";
        }
        else if (age < 12) {
            return "adult";
        }
        else {
            return "senior";
        }
    }
//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String toString() {
        return "this cat's name is: " + name
                + "\n" + "this cat is a " + breed
                + "\n" + "this cat has " + numOfLegs + " legs"
                + "\n" + "this cat was born in the year " + yearBorn;
    }
}
