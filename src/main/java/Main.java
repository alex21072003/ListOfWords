import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"banan","watermelon","watermelon","pear","pear","pear"};
        HashSet<String> setWords = new HashSet<>();
        setWords.addAll(List.of(words));
        int countOfRepeat = 0;
        HashMap<String,Integer>wordsAndRepeat = new HashMap<>();

        for (String setWord : setWords){
            for(String word : words){
                if(word.equals(setWord)){
                    countOfRepeat++;
                }

            }
            wordsAndRepeat.put(setWord,countOfRepeat);
            countOfRepeat=0;
        }
        wordsAndRepeat.forEach((k, word) -> System.out.println(k + " - "+ word));
    }
}
