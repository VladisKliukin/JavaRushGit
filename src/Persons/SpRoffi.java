package Persons;

import Core.Poem;

public class SpRoffi extends Person{

    public void addTextToPoem(){

        Poem.getInstance().addLineAtIndex(1,"");
        Poem.getInstance().addLineAtIndex(1,"");
        Poem.getInstance().addLineAtIndex(1,"");

    }
}
