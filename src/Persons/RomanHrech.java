package Persons;

import Core.Poem;

public class RomanHrech extends Person {
    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(12, "Королевий Цвіте!»");
    }
}
