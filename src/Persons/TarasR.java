package Persons;

import Core.Poem;

public class TarasR extends Person {

    @Override
    public void addTextToPoem(){
//Commit - Taras - lines(50,80,78,31,22)
        Poem.getInstance().addLineAtIndex(50,  "Убити не вбили,");
        Poem.getInstance().addLineAtIndex(80,  "Цвітом на сім світі?");
        Poem.getInstance().addLineAtIndex(78,  "Королевий Цвіте,");
        Poem.getInstance().addLineAtIndex(31,  "І плакала? Я не знаю,");
        Poem.getInstance().addLineAtIndex(22,  "«Брате мій, з тобою");

    }
}
