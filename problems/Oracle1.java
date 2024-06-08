import java.util.*;

public class Oracle1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC_123", "BCD_234", "CDF_345");

        // Sort the list in descending order based on the number after underscore
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num1 = Integer.parseInt(s1.split("_")[1]);
                int num2 = Integer.parseInt(s2.split("_")[1]);
                return num2 - num1; // Sort in descending order
            }
        });

        // Print the sorted list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
