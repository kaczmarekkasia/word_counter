import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map  <String, Integer> words= new HashMap<>();

    public Map<String, Integer> coutWords (String contentFromUser){
        int counter = 0;
        for (String word : contentFromUser.split(" ")) {
            if (words.containsKey(word)){
                counter=words.get(word);
                counter++;
            } else{
                counter = 1;
            }
            words.put(word, counter);
        }
        return  words;
    }

    public void showMapOfWors(){
        for (Map.Entry<String, Integer> komplet : words.entrySet()) {
            System.out.println(komplet.getKey()+ " -> "+komplet.getValue());
        }
    }

    public Map<String, Integer> clearMap(){
        return words = new HashMap<>();
    }

}
