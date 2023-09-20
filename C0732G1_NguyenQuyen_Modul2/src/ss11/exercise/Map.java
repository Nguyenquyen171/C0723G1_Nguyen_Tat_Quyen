package ss11.exercise;
import java.util.Scanner;
import java.util.TreeMap;
public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> wordFrequencyMap = new TreeMap<>();
        System.out.println("Enter the String");
        String line = scanner.nextLine();
        String [] newLine= line.split(" ");
        for (String words : newLine) {
            if (wordFrequencyMap.containsKey(words.toLowerCase())) {
                wordFrequencyMap.put(words.toLowerCase(), wordFrequencyMap.get(words) + 1);
            } else {
                wordFrequencyMap.put(words.toLowerCase(), 1);
            }
        }
        System.out.println(wordFrequencyMap);
    }
}

