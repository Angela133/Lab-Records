import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        System.out.println("\nName : ANGELA MATHEW");
	System.out.println("Reg.No : SJC22MCA-2005");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Course Name : OOPS LAB");
	System.out.println("Date : 27 JUNE 2023");
	System.out.println("\n-------------------------------------------------------------\n");

        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            map.put(key, value);
        }

        // Printing the initial map
        System.out.println("Initial Map:");
        printMap(map);

        // Changing an element
        System.out.print("Enter the key to change the value: ");
        String keyToChange = scanner.nextLine();
        if (map.containsKey(keyToChange)) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            map.put(keyToChange, newValue);
            System.out.println("Value changed successfully.");
        } else {
            System.out.println("Key not found in the map.");
        }

        // Removing an element
        System.out.print("Enter the key to remove the element: ");
        String keyToRemove = scanner.nextLine();
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Key not found in the map.");
        }

        // Printing the final map
        System.out.println("Final Map:");
        printMap(map);

        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

