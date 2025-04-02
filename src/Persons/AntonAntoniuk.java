package Persons;

import Core.Poem;

public class AntonAntoniuk extends Person {

    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(10, " ");
        Poem.getInstance().addLineAtIndex(20, " ");
        Poem.getInstance().addLineAtIndex(30, " ");

    }
}