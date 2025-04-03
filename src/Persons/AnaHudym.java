package Persons;

import Core.Poem;

public class AnaHudym extends Person{
    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(64,  "Цвітом при долині,");

    }
    }


