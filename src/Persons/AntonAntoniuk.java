package Persons;

import Core.Poem;

public class AntonAntoniuk extends Person {

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(9, " ");
        Poem.getInstance().addLineAtIndex(18, " ");
        Poem.getInstance().addLineAtIndex(27, " ");
    }
}
