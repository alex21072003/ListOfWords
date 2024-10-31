import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        List<String>uniqNewWords = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {

            System.out.println("Enter word");
            String word = new Scanner(System.in).nextLine();
            if(!uniqNewWords.contains(word)) {
                uniqNewWords.add(word);
            }
        }
        uniqNewWords.forEach(System.out::println);
    }
}