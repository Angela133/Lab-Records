import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q18{
    public static void main(String[] args) {
      System.out.println("\nName : ANGELA MATHEW");
	System.out.println("Reg.No : SJC22MCA-2005");
	System.out.println("Course Code : 20MCA132");
	System.out.println("Course Name : OOPS LAB");
	System.out.println("Date : 27 JUNE 2023");
	System.out.println("\n-------------------------------------------------------------\n");

        Map<String, Integer> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); 
       
        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); 
            hashMap.put(key, value);
        }

        
        System.out.println("Initial HashMap:");
        printMap(hashMap);

        
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);


        System.out.println("Final TreeMap:");
        printMap(treeMap);

        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

