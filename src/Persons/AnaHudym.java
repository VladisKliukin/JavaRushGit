package Persons;

import Core.Poem;

public class AnaHudym extends Person{
    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(64,  "Цвітом при долині,");
        Poem.getInstance().addLineAtIndex(83,  "Мене й матір?.. Милосердий");
        Poem.getInstance().addLineAtIndex(5,  "За що вони тепер мене");
        Poem.getInstance().addLineAtIndex(27,  "Моя мати... чого вона,");

    }
    }


