package pacuraru.fabian.lab6.ex4;

import java.util.HashMap;
import java.util.Set;

public class Dictionary {
    HashMap<Word, Definition> dictionary = new HashMap<>();
    public void addWord(Word w, Definition d) {
        dictionary.put(w,d);
    }
    public Definition getDefinition(Word w) {
        Definition def = new Definition("not existent");
        Set<Word> allWords = dictionary.keySet();
        for(Word words : allWords){
            if(words.getName().equals(w.getName()))
                def = dictionary.get(words);
        }
        return def;
    }
    public void getAllWords() {
        Set<Word> allWords = dictionary.keySet();
        for(Word words : allWords){
            System.out.println(words.getName());
        }
    }
    public void getAllDefinitions() {
        Set<Word> allWords = dictionary.keySet();
        for(Word words : allWords){
            Definition def = dictionary.get(words);
            System.out.println(def.getDescription());
        }
    }
}
