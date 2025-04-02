package Persons;

import Core.Poem;

public class AndriyTsomko extends Person{

    @Override
    public void addTextToPoem() {
        Poem.getInstance().addLineAtIndex(2, "Люде не любили?");
        Poem.getInstance().addLineAtIndex(8, "Очей не спускають");
    }
}
