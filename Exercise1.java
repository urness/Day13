import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        // ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("Aaron");
        System.out.println("Strings before sorting: " + names);

        Collections.sort(names);

        System.out.println("Strings after sorting: " + names);


        // ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        Random randomNumbers = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(randomNumbers.nextInt(100));
        }
        System.out.println("Integers before sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("Integers after sorting: " + numbers);

        // ArrayList of RocketShips
        ArrayList<RocketShip> ships = new ArrayList<>();
        ships.add(new RocketShip("Apollo", 100, 0, 2));
        ships.add(new RocketShip("Falcon", 80, 0, 0));
        ships.add(new RocketShip("Voyager", 60, 0, 1));

        
        Collections.sort(ships);

        System.out.println("RocketShips:");
        for (RocketShip ship : ships) {
            System.out.println("  " + ship);
        }
    }
}
