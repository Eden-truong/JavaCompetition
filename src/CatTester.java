import java.util.ArrayList;
import java.util.List;

/** Class: CatTester.java
 * @author Eden Truong
 * @version 1.0
 * Written: Jan 17, 2024
 *
 * This class tests the Cat.Java class
 */

public class CatTester {
    public static void main(String[] args) {
        int totalLegs = 0;
        Cat bob = new Cat("Bob", "Maine Coon", 2020); //meow cat declaration
        Cat oreo = new Cat("Oreo", "Siamese", 2015);
        Cat cinna = new Cat("Cinna", "British Shorthair", 2023);

        List<Cat> kennel = new ArrayList<>(); //arrayList

        kennel.add(bob); //adding them kittens
        kennel.add(oreo);
        kennel.add(cinna);

        for (Cat catLegs: kennel) { //enhanced for loop cause im ballin
            totalLegs += catLegs.numOfLegs;
        }
        System.out.println("The amount of cat leggies after being added is " + totalLegs);
        System.out.println(bob.getStageOfLife());
        System.out.println(bob.toString());
        System.out.println(bob.findAge());

    }

}
