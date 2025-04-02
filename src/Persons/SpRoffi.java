package Persons;

import Core.Poem;

public class SpRoffi extends Person{

    @Override
    public void addTextToPoem(){

        Poem.getInstance().addLineAtIndex(7,"Царівною називають,");
        Poem.getInstance().addLineAtIndex(33,"Хто їй лихо заподіяв?");
        Poem.getInstance().addLineAtIndex(35,"Я гралася, забавлялась,");
        Poem.getInstance().addLineAtIndex(59,"Молодого, короткого");
        Poem.getInstance().addLineAtIndex(88,"Червоно-рожеву");

    }
}
