package Persons;

import Core.Poem;

public class AnaHudym extends Person{
    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(1,  " ");
        Poem.getInstance().addLineAtIndex(1,  " ");
    }
    }


