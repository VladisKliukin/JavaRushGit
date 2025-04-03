package Persons;

import Core.Poem;

public class AntonAntoniuk extends Person {

    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(6, "В палатах вітають,");

    }
}