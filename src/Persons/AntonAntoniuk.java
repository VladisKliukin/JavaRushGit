package Persons;

import Core.Poem;

public class AntonAntoniuk extends Person {

    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(8,  " ");
        Poem.getInstance().addLineAtIndex(16,  " ");
        Poem.getInstance().addLineAtIndex(25,  " ");
    }
}
