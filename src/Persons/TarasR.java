package Persons;

import Core.Poem;

public class TarasR extends Person {

    @Override
    public void addTextToPoem(){
//Commit
        Poem.getInstance().addLineAtIndex(1," ");
        Poem.getInstance().addLineAtIndex(1," ");

    }
}
