package Persons;

import Core.Poem;

public class BestFunCoder extends Person {

    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(21,  "Заплакала і сказала: ");
       //Poem.getInstance().addLineAtIndex(30,  "Дивилась, дивилась");
       //Poem.getInstance().addLineAtIndex(39,  "Та й умерла. А мене пан");
    }
}