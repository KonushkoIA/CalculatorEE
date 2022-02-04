package storage;

import java.util.ArrayList;

public class InMemoryOperationStorage {
    private static final ArrayList<String> story = new ArrayList<>(10);

    public void save(String str){
        story.add(str);
    }

    public ArrayList<String> getStory(){
        return story;
    }
}
