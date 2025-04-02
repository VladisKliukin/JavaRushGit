package Persons;

import Core.Poem;

public class Lamaret extends Person{
    @Override
    public void addTextToPoem() {

        Poem.getInstance().addLineAtIndex(18,  "Личенька Лілеї.");
        Poem.getInstance().addLineAtIndex(32,  "Мій брате єдиний!");
        Poem.getInstance().addLineAtIndex(52,  "Остригли, накрили");
        Poem.getInstance().addLineAtIndex(54,  "Та ще й реготались.");
        Poem.getInstance().addLineAtIndex(84,  "Святий Боже милий!»");

    }
}
