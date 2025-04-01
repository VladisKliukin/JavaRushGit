package Persons;
import Core.Poem;

public class Shatroffsky extends Person{

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(3, " ");
    }
}
