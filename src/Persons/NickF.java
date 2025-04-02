package Persons;

import Core.Poem;

public class NickF extends Person {
    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(4, " ");
        Poem.getInstance().addLineAtIndex(9, " ");
    }
}
