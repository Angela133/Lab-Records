import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String[] strings = {"dog", "cat", "bird", "zebra", "elephant"};
        
        Arrays.sort(strings);
        
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
